package com.geekster.project1;

public class A {
	
	public static void main(String args[]) {
		
		// static method
		B.add(10,7);
			
		// non-static method
		
		B obj=new B();
		
		obj.show(6,4);
		
	}

}
