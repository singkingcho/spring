package com.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.HelloP;

public class TestP {

	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HelloP hp =  (HelloP) ctx.getBean("helloP");
		System.out.println(hp.getName());
	}
	
	@Test
	public void m2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HelloP hp =  (HelloP) ctx.getBean("helloP2");
		System.out.println(hp);
	}
}
