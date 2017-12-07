package com.bdqn.collection;

import java.util.List;

public class Author {

	private Integer id;
	
	private String name;
	
	private List<String> loves;
	
	private List<Blog> blogs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<String> getLoves() {
		return loves;
	}

	public void setLoves(List<String> loves) {
		this.loves = loves;
	}
	
	

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", loves=" + loves + "]";
	}

 
	
}
