package com.java1234.service.impl;

import javax.jws.WebService;

import com.java1234.service.HelloWorld;

@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String hello(String name) {
		return name+",你好！";
	}

}
