package com.accenture.lkm.oop.associations.inheritance.supr;

public class MyBaseClass {
	// private int timer = 9; // this member variable is not visible,bcoz its private access specifier
		int timer = 9;
		int testVar;
		
		public MyBaseClass() {
			System.out.println("BaseClass constructor invoked!!");
		}
		
		public MyBaseClass(int testVar) {
			this.testVar = testVar;
			System.out.println("BaseClass constructor invoked!!"+testVar);
		}
		
		public void myMethod() {
			System.out.println(" Base class method");
		}

}
