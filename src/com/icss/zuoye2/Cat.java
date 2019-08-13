package com.icss.zuoye2;

public class Cat extends pet {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("ίχίχ...");
	}

}
