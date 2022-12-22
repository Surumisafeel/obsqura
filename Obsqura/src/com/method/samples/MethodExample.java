package com.method.samples;

public class MethodExample {
	public static void add(){
	System.out.println(10+10);
	}
	private void sub(){
		System.out.println(7-1);
	}
	
	void mult (){
		System.out.println(7*1);
	}
		
	
	public static void main(String[] args) {
		MethodExample.add();
		MethodExample obj = new MethodExample();
		obj.sub();
		obj.mult();
		
		
	}

}
