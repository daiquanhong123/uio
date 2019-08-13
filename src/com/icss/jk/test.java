package com.icss.jk;

public class test {
	public static void main(String[] args) {
		Ying y = new Ying();
		y.Fly();
		y.sleep();
//		Penguin p = new Penguin();
		swim s = new Penguin();// 接口引用指向的子实现类的对象
		s.swim();
		// s.sleep();

	}
}
