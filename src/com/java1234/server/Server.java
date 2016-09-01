package com.java1234.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.java1234.service.HelloWorld;
import com.java1234.service.impl.HelloWorldImpl;

public class Server {

	public static void main(String[] args) {
		System.out.println("webservice start!");
		HelloWorld helloWorldImpl = new HelloWorldImpl();
		String address = "http://192.168.0.101/hello?wsdl";
		// Endpoint.publish(address, helloWorldImpl);
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(address);
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setServiceBean(helloWorldImpl);
		factoryBean.create();
		System.out.println("webservice started!");
	}
}
