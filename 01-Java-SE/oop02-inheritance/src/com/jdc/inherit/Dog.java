package com.jdc.inherit;

public class Dog extends Animal {
	
	{
		System.out.println("Dog Instance Block");
	}
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String species) {
		super(species);
		System.out.println("Dog Constructor");
		setColor("Black");
	}
	


}








