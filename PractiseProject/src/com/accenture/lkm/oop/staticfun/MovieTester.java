package com.accenture.lkm.oop.staticfun;

public class MovieTester {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		System.out.println(Movie.movieObjectCount); 
		System.out.println(movie1.greetUser("Rishabh"));
		System.out.println(Movie.snackTime(1, 1));
		
		Movie movie2 = new Movie();
		System.out.println(Movie.movieObjectCount); 
		System.out.println(movie2.greetUser("Akash"));
		System.out.println(Movie.snackTime(2, 1)); 

	}
}

