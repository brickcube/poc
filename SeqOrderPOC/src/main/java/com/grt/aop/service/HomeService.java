package com.grt.aop.service;

import org.springframework.stereotype.Service;

import com.grt.aop.domain.EntityClass;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HomeService {

	public void testAOP(EntityClass entityClass) {
		log.debug("testAOP called in service");
		log.debug(entityClass.toString());
	}
}
