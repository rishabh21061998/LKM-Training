package com.accenture.lkm.oop.exceptions;

public class Demo10 {

	public static void main(String[] args) {
		try{
			int result = Demo10.divide(20,0);
			System.out.println(result);
		} catch(ArithmeticException | NullPointerException e) {
			System.out.println("exception bcoz: "+e.getMessage());
		} 
		System.out.println("program terminates!!");
	}

	//Propagating the exception to the calling method
	public static int divide(int num1, int num2) throws ArithmeticException, NullPointerException {
		int result=0;
		String userName = null;
		System.out.println(userName.length());
		result = num1/num2;
		return result;
	}
}
