package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Boy;
import com.bdqn.bean.EmptyOrNull;
import com.bdqn.bean.HelloWorld;

public class TestEmptyAndNull {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmptyOrNull empty = (EmptyOrNull) ctx.getBean("empty");
		System.out.println(empty.getName() + "===");
		EmptyOrNull empty2 = (EmptyOrNull) ctx.getBean("empty2");
		System.out.println(empty2.getName() + "--------");
		
	}
}
