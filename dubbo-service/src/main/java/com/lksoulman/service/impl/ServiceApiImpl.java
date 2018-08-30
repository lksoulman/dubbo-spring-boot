package com.lksoulman.service.impl;

//import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.annotation.Service;
import com.lksoulman.dubbo.api.ServiceApi;

@Service(version = "1.0.0")
public class ServiceApiImpl implements ServiceApi {

	@Override
	public String sayHello() {
		return "Hello World";
	}
}
