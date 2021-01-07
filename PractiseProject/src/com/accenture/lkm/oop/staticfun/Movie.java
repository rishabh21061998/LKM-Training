package com.accenture.lkm.oop.staticfun;


public class Movie {
	static int movieObjectCount;
	
	static {
		System.out.println("static block 1 ");
		movieObjectCount = 0; 

	}
	
	static {
		System.out.println("static block 2 ");}
		
	
	public Movie() {
		System.out.println("Movie constructor");
		movieObjectCount++;
	}
	
	public String greetUser(String userName) { 
		return  "Welcome, "+userName;
	}
	
	public static String snackTime(int popcornTubs, int softdrinks) { 
		return  "Your ordered "+popcornTubs+", "+softdrinks;
	}
	
	

}

