package com.icss.zuoye;

import java.util.Random;

public class test {
	/*
	 * Q1�� ����һ���ӿ�Jump���г��󷽷�jump() ����ʵ�ֽӿڣ�����ʵ�ֽӿ���дjump���� ��������ͬʱ��ʼ��
	 * Test��������10�����Ӻʹ���jump��������
	 */
	public static void main(String[] args) {
		Daisu d = new Daisu("����");

		Rubbit b = new Rubbit("����");
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
