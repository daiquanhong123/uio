package com.icss.zuoye2;

public class YingWu  extends pet implements AnimalFly{

	public YingWu(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("学人说话....");
	}

	@Override
	public void fly() {
		System.out.println("正在飞....");
	}

}
