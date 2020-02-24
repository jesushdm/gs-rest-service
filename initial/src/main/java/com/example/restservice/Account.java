package com.example.restservice;

public class Account {
	private  long id;
	private  String content;
	
	//constructor
	public Account(long id, String content) {
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
}
