package com.lksoulman.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lksoulman.dubbo.service.ServiceApiImpl;

@RestController
public class Controller {

	@Autowired
	private ServiceApiImpl serviceApiImpl;

	@RequestMapping(value = "/")
	public String hello() {
		return serviceApiImpl.sayHello();
	}
}
