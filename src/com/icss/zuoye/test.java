package com.icss.zuoye;

import java.util.Random;

public class test {
	/*
	 * Q1： 定义一个接口Jump，有抽象方法jump() 袋鼠实现接口，兔子实现接口重写jump（） 创建对象同时初始化
	 * Test类随机输出10次兔子和袋鼠jump（）方法
	 */
	public static void main(String[] args) {
		Daisu d = new Daisu("袋鼠");

		Rubbit b = new Rubbit("兔子");
		Random ran = new Random();
		for (int i = 1; i <= 10; i++) {
			int num = ran.nextInt(2);
			switch (num) {
			case 0:
				d.jump();
				break;
			default:
				b.jump();
				break;
			}
		}

	}

}
