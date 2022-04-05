package com.imooc.service.impl;

import com.imooc.service.WelcomeService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
