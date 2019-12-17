package com.spring.restdemo;

public class Greeting {
	
	private int Id ;
	private String name;
	
	public Greeting(int _Id, String _name) {
		Id =   _Id;
		name = _name;
	}
	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}
	
	

}
