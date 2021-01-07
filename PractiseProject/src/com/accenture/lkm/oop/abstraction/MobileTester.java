package com.accenture.lkm.oop.abstraction;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==Real ME===");
		RealMe realMe = new RealMe();
		System.out.println(realMe.greetMessage());
		System.out.println(realMe.doRepair());
		System.out.println(realMe.doAddDisplay());

		System.out.println("==Oppo===");
		Oppo oppo = new Oppo();
		System.out.println(oppo.greetMessage());
		System.out.println(oppo.doRepair());
		System.out.println(oppo.doAddDisplay());

	}

}
