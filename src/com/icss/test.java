package com.icss;

public class test {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.dy();
		z.jk();
		z.tv();
		
		//��̬�ķ�ʽ
		Fu f = new Zi();
		f.dy();
		f.jk();
		//��Ҫ���������������� ����ת��
		Zi z1 = (Zi) f;
		z1.tv();
	}
public void pk(Fu z1, Fu z2){
	
}
}
