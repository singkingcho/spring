package com.bdqn.bean;

public class HelloWorld {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public void init() {
		System.out.println("我要初始化了");
	}
	
	public void destroy() {
		System.out.println("完蛋了");
	}
	
}
