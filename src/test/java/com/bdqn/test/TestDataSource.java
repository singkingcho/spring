package com.bdqn.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {

	
	@Test
	public void m1() throws SQLException {

		ApplicationContext ctx  =  new ClassPathXmlApplicationContext("beans.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection().getMetaData().getDatabaseProductName());
	}
	
	public static void main(String[] args) throws SQLException {

		ApplicationContext ctx  =  new ClassPathXmlApplicationContext("beans.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
}
