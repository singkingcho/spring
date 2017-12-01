package com.bdqn.bean;

public class TextEditor {

	private SpellChecker spellCheker ;

	public SpellChecker getSpellCheker() {
		return spellCheker;
	}

	public void setSpellCheker(SpellChecker spellCheker) {
		this.spellCheker = spellCheker;
	}
	
	public void spellCheck() {
		spellCheker.checkSpelling();
	}
}
