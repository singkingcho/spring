package com.bdqn.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	
//	 属性注入
//	@Autowired
	private SpellChecker spellCheker ;

	public SpellChecker getSpellCheker() {
		return spellCheker;
	}

	
	public TextEditor() {
		// TODO Auto-generated constructor stub
	}
	
	// 构造注入
	@Autowired
	public TextEditor(SpellChecker spellCheker) {
		super();
		this.spellCheker = spellCheker;
	}



	//@Autowired set注入
	public void setSpellCheker(SpellChecker spellCheker) {
		this.spellCheker = spellCheker;
	}
	
	public void spellCheck() {
		spellCheker.checkSpelling();
	}
}
