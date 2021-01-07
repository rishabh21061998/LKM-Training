package com.accenture.lkm.oop.javaCollections;

import java.util.ArrayList;
import java.util.List;

public class MovieTester {
	
	public static void main(String[] args) {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		Movie movie1 = new Movie(1001,"Hello",3);
		Movie movie2 = new Movie(1002,"Java..the ocean",5);
		Movie movie3 = new Movie(1003,"yourwish",4);
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		System.out.println(movies);
		
		
		//objects, iteration, check with condition
		/*
		 * if(movies.contains("Java..the ocean")) {
		 * System.out.println("hey movie is there in the list"); } else {
		 * System.out.println("Some thing is burning!!"); }
		 */
		
		//Comparable and Comparator
		
	}

}