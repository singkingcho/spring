package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Boy;
import com.bdqn.bean.HelloWorld;

public class TestBoy {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Boy boy = ctx.getBean(Boy.class);
		System.out.println(boy.getName());
	}
}
