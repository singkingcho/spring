package com.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.anno.Boss;
import com.bdqn.anno.SimplerMovieLister;
import com.bdqn.bean.HelloWorld;
import com.bdqn.bean.HelloWorldConfig;

public class TestAnnotation {

	public static void main(String[] args) {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		// 也可以通过注册的方式进行
		ctx.register(HelloWorld.class);
		ctx.register(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMsg("ddd");
		System.out.println(helloWorld.getMsg());
	}
	
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annobeans.xml");
		Boss boss = (Boss) ctx.getBean("boss");
		System.out.println(boss);
		 
	}
}
