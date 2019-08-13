package com.icss.zuoye;

public class Daisu  implements Jump {
	String name;
     public Daisu(String name) {
    	 this.name = name;
	}

	@Override
	public void jump() {
		System.out.println( name+"ÕıÔÚÌø¡£¡£");
	}

}
