package com.ofss;

public class Calculator {
	
	int a;
	int b;
	
	public Calculator() {
		super();
	}
	
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int add(int a, int b) {		
		return a+b;
	}
	public int subtract(int a, int b) {		
		return a-b;
	}

}
