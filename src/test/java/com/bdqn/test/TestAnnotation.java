package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
}
