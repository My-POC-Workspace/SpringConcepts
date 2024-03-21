package com.di.demo;

import org.springframework.stereotype.Component;

@Component("mess")
public class Message {

	private String msg = "Hello, I'm the msg to be read...";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
