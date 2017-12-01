package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Boy;
import com.bdqn.bean.HelloWorld;
import com.bdqn.bean.TextEditor;

public class TestTextEditor {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// spellChecker cons............ 先执行了spellChekerCons的代码

		TextEditor te = (TextEditor) ctx.getBean("textEditor");
		// in checking............
		te.spellCheck();
	}
}
