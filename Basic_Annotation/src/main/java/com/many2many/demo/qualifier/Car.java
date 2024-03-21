package com.many2many.demo.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class Car implements Speed{

	@Override
	public String getSpeed() {
		// TODO Auto-generated method stub
		return "Car speed is 60kmph";
	}

}
