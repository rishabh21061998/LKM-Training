package com.accenture.lkm.oop.javaCollections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		set.clear();
		Collections.addAll(set,6);
		System.out.println(set);
	}

}
