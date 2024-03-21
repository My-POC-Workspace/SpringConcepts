package com.many2many.demo.qualifier;

import org.springframework.stereotype.Service;

@Service
public class Bike implements Speed{

	@Override
	public String getSpeed() {
		// TODO Auto-generated method stub
		return "Bike speed is 70kmph";
	}

}
