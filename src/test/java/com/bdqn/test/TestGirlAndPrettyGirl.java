package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Girl;
import com.bdqn.bean.HelloWorld;
import com.bdqn.bean.PrettyGirl;

public class TestGirlAndPrettyGirl {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Girl girl =  (Girl) ctx.getBean("girl");
		PrettyGirl pg = (PrettyGirl) ctx.getBean("prettyGirl");
		System.out.println(girl.getName());
		
		System.out.println(pg.getName() + pg.getLove());
		
	}
}
