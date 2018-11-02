package com.grt.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grt.aop.domain.EntityClass;
import com.grt.aop.service.HomeService;

@RestController
@RequestMapping(
	"/"
)
public class HomeController {

	@Autowired
	private HomeService service;

	@PostMapping(
		"aopRequest"
	)
	public String testAOP(@RequestBody EntityClass entityClass) {
		service.testAOP(entityClass);
		return "success";
	}
}