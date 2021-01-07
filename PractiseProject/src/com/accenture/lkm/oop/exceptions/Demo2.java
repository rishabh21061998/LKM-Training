package com.accenture.lkm.oop.exceptions;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo2.division(5,0));
		System.out.println("Terminates");
	}

	public static int division(int num1, int num2) {
		if(num2 == 0) { // programatically handling the condition
			return -1;
		}
		return num1/num2;
	}
	}

