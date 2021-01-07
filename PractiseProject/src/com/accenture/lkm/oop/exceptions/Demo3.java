package com.accenture.lkm.oop.exceptions;

public class Demo3 {
	public static void main(String[] args) {

		System.out.println(Demo3.division(5,0));
		System.out.println("Terminates");
	}

	public static int division(int num1, int num2) {
		int result=0;
		try {
			result = num1/num2;
		}catch(Exception e) {
			System.out.println("Deminator is zero");
			System.out.println(e.getMessage());
		//	e.printStackTrace();
		}
		return result;
	}

}
