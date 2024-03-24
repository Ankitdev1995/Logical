package com.overriding;

public class Car extends Vehicle{

	@Override
	public void drive() {
		System.out.println("car can drive");
	}

}
