package com.accenture.lkm.oop.javaCollections;

import java.util.HashSet;
import java.util.Set;
public class Demo1 {

		public static void main(String[] args) {
			
			Set<String> set = new HashSet<String>();
			System.out.println(" Is set empty? "+set.isEmpty());
			set.add("Rishabh");
			set.add("Yash");
			set.add(null);
			set.add("Isha");
			set.add(null);
			System.out.println(" Is Set empty? "+set.isEmpty());
			System.out.println(set);
			System.out.println("Size of set: "+set.size());
			System.out.println("Using For Loop");
			for (Object object : set) {
				System.out.println(object);
			}
			
		}

	}
