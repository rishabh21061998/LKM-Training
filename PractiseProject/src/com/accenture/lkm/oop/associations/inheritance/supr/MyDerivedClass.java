package com.accenture.lkm.oop.associations.inheritance.supr;

public class MyDerivedClass extends MyBaseClass {
	int timer = 10; // instance variable

	public MyDerivedClass() {
		super(20);
		System.out.println("MyDerived constructor invoked!!");
	}

	public void printTheTimer(int timer) { // local/parameter
		System.out.println(super.timer); // super keyword referes to parent class properties/methods/Constrcutors
		System.out.println(timer);
		super.myMethod();
	}
}
