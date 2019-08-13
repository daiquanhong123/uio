package com.icss;

public class test1 {
public static void main(String[] args) {
	A a = new B ();
	a.show();
	System.out.println(a.i);
}
}
 class A{
	int i = 9;
 void show(){
		System.out.println( "A show...." +i);
	}
}
	class B extends A{
		int i = 6;
	 void show(){
			System.out.println("B show...." + i);
		}
	}

