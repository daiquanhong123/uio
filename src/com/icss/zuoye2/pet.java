package com.icss.zuoye2;

public abstract class pet implements AnimalSpeak {
  private String name; 
 public pet(String name){
	 this.name = name;
	 
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
