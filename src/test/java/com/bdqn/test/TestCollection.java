package com.bdqn.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Girl;
import com.bdqn.bean.MyCollection;

public class TestCollection {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		MyCollection mc = (MyCollection) ctx.getBean("myCollection");
		for (String string : mc.getAddressList()) {
			System.out.println(string);
		}
		
		Set<Girl> girls =  mc.getGirls();
		for (Girl girl : girls) {
			System.out.println(girl);
		}
		
		Map<String, Object> maps = mc.getMaps();
		
		Iterator<Entry<String, Object>>  it = maps.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Object> entry = it.next();
			String key =  entry.getKey();
			Object value = entry.getValue();
			System.out.println("key:" + key + ", value:" + value);
		}
		
		Properties properties = mc.getProperties();
		Enumeration<Object> enumeration = properties.keys();
		
		while(enumeration.hasMoreElements()) {
			Object e =  enumeration.nextElement();
			System.out.println(properties.get(e));
		}
	 
	}
}
