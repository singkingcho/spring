package com.bdqn.anno;

import org.springframework.beans.factory.annotation.Autowired;

public class SimplerMovieLister {

	private MovieFinder movieFinder;
	
	
 
	public void  setMovieFinder(MovieFinder movieFinder ) {
		this.movieFinder = movieFinder;
	}
	
	
	public void find() {
		movieFinder.findMovie();
	}
}
