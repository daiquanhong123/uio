package com.icss.zuoye2;

public class YingWu  extends pet implements AnimalFly{

	public YingWu(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("ѧ��˵��....");
	}

	@Override
	public void fly() {
		System.out.println("���ڷ�....");
	}

}
