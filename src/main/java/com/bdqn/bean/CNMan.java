package com.bdqn.bean;

import com.bdqn.bility.Fight;
import com.bdqn.bility.Request;

public class CNMan implements Fight{

	private Request request;
	
	public CNMan() {
	}

	
	public CNMan(Request request) {
		this.request = request;
	}


	@Override
	public void fighting() {
		request.ask();
	}
	
	


	 
	
	
}
