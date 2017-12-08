package com.bdqn.anno;

public class PrettyGirlMovieFinder implements MovieFinder{

	public PrettyGirlMovieFinder() {
		System.out.println("pretty....");
	}
	
	@Override
	public void findMovie() {
		System.out.println("巴拉巴拉小魔仙");
	}

	
}
