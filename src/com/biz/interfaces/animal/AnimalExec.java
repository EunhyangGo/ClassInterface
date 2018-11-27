package com.biz.interfaces.animal;

public class AnimalExec {

	public static void main(String[] args) {
		Crocodail crocodail = new Crocodail();
		Elephant elephant = new Elephant();
		
		crocodail.viewName();
		crocodail.viewColor();
		
		elephant.viewName();
		elephant.viewColor();
	}
}
