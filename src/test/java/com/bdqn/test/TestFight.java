package com.bdqn.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.InitAndDesctroy;
import com.bdqn.bility.Fight;
import com.bdqn.conf.MyContext;

public class TestFight {

	
	@Test
	public void m1() throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Fight fight =  (Fight) ctx.getBean("fight");
		fight.fighting();
	}
	
	@Test
	public void testInitAndDestory() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		InitAndDesctroy iad = (InitAndDesctroy) ctx.getBean("initAndDestroy");
//		((ClassPathXmlApplicationContext)ctx).close();
		((ClassPathXmlApplicationContext)ctx).registerShutdownHook();
	
	}
}
