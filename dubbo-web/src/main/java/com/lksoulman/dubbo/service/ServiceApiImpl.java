package com.lksoulman.dubbo.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lksoulman.dubbo.api.ServiceApi;

@Service
public class ServiceApiImpl {

	@Reference(version="1.0.0")
	ServiceApi serviceApi;
	
	public String sayHello() {
		return serviceApi.sayHello();
	}
}
