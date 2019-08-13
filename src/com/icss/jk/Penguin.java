package com.icss.jk;

public class Penguin extends Bird implements swim {

	@Override
	public void swim() {
		System.out.println("企鹅在晃晃悠悠的游泳");
	}

}
