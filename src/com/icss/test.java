package com.icss;

public class test {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.dy();
		z.jk();
		z.tv();
		
		//多态的方式
		Fu f = new Zi();
		f.dy();
		f.jk();
		//想要访问子类特有内容 向下转型
		Zi z1 = (Zi) f;
		z1.tv();
	}
public void pk(Fu z1, Fu z2){
	
}
}
