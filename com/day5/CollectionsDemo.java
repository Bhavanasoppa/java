package com.day5;

import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
HashSet<String> s1 = new HashSet<String>();
		s1.add("Beginner");
		s1.add("Java");
		s1.add("Java");
		s1.add("tutorial");
		
		System.out.println("Elements as a set" +s1);
		System.out.println("\n s1.contains java :" +s1.contains("Java"));
       /* TreeSet<String> t1=new TreeSet<String>(s1);
        System.out.println("t1.equals s1:" +t1.equals(s1));
        Iterator<String> itr=t1.iterator*/

	}

}
