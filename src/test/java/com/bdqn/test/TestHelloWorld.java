package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.HelloWorld;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// 我们并没有通过new对象的方式创建对象，而是交给spring这个容器来自动帮我们完成
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld.getMsg());
		 
		
		/*
		 * 我要初始化了
			你的头发还好吗
			我们getBean完成就要执行。

		 */
		// 验证单例 scope="singleton"  默认就是单例的。
		HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
		/// >>>true
//		System.out.println(helloWorld == helloWorld2);
		// 验证原型 scope="prototype"  >>> false  
		System.out.println(helloWorld == helloWorld2);
		/*
		 * 使用原型还是使用单例
		 * 如果范围设置为原型，那么Spring IoC容器每次创建对该特定bean的请求时都会创建该对象的一个​​新的bean实例。
		 * 需要有状态使用原型。
		 * 无状态bean使用单例。
		 */ 
		((AbstractApplicationContext)ctx).registerShutdownHook();
	}
}
