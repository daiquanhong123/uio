package com.icss.zuoye2;

public class House {
	pet[]p;
int len;
House(int i ){
	p = new pet[i];
}
void addpet(pet pe){
	if (len>=p.length) {
		System.out.println("�Ѿ���Ա�˲��������");
	}else{
		p[len++] =pe;
	}
}
void speakall(){
	for (pet pe : p) {
		if (pe!=null) {
			pe.speak();
		}
	}
	}
	void flyall(){
		
		for (pet pe : p) {
			if (pe != null) {
				if (pe instanceof AnimalFly) {
				 ((AnimalFly) pe).fly();
				}
			}
		}
	
}
}
