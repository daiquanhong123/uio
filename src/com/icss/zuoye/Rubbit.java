package com.icss.zuoye;

public class Rubbit implements Jump {
  String name;
  public Rubbit(String name){
	  this.name  = name;
  }
	@Override
	public void jump() {
		System.out.println( name +"Ìø.....");
		
	}

}
