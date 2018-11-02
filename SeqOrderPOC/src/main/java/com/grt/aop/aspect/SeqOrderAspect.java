package com.grt.aop.aspect;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Component;

import com.grt.aop.domain.Domain;
import com.grt.aop.domain.GridDomain;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class SeqOrderAspect {

	@Before(
		"execution(public void testAOP(*))"
	)
	public void setSeqOrderAdvice(JoinPoint joinPoint) {
		log.debug("in aspect");
		Object params[] = joinPoint.getArgs();
		for (Object parameter : params) {
			if (parameter instanceof Domain) {
				Method[] methods = parameter.getClass().getMethods();
				for (Method method : methods) {
					if (method.getName().startsWith("get") && List.class.isAssignableFrom(method.getReturnType())) {
						processParameter(parameter, method);
					}
				}
			}
		}
	}

	private void processParameter(Object parameter, Method method) {
		log.debug(String.format("in aspect class %s method  %s with type %s", parameter.getClass().getName(),
				method.getName(), method.getReturnType()));
		try {
			List<GridDomain> listValue = (List) method.invoke(parameter, null);
			log.debug("Before " + listValue.toString());
			for (int i = 0; i < listValue.size(); i++) {
				GridDomain gridDomain = listValue.get(i);
				gridDomain.setSeqOrder(i + 1);
			}
			log.debug("after " + listValue.toString());
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			log.error(String.format("%s Given Parameter out of GridDomain", method.getName()));
		}
	}
}
