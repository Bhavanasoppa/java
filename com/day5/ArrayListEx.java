package com.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> arraylistA=new ArrayList<Integer>();
		ArrayList<String> arraylistB=new ArrayList<String>();

		for(int i=0;i<5;i++){
			arraylistA.add(i);
		}
		System.out.println(arraylistA);
		arraylistB.add("beginner");
		arraylistB.add("java");
		arraylistB.add("tutorial");
		arraylistB.add(".");
		arraylistB.add(3,"com");
		arraylistB.add("java");
		arraylistB.add("site");

		System.out.println("Second element is "+arraylistB.get(2));
		arraylistB.remove("java");
		System.out.println("ArrayListB "+arraylistB);
		Iterator<Integer> i1=arraylistA.iterator();
		System.out.println("ArrayList arraylistA -->");
		while(i1.hasNext()){
			System.out.println(i1.next() + " ");
		}
		System.out.println();
		System.out.println("ArrayList arraylistA -->");
		for(int j=0;j<arraylistA.size();j++){
			System.out.println(arraylistA.get(j) + " ");
		}
		System.out.println();

		//sort an ArrayList;
		System.out.println("Sorted ArrayList arrraylistA --> ");
		Collections.sort(arraylistA);

		System.out.println(arraylistA);
		System.out.println();

		//Reversing an ArrayList
		System.out.println("Reversed ArrayList arrayliatA -->");
		Collections.reverse(arraylistA);
		System.out.println(arraylistA);
		System.out.println();
		ListIterator<String> i2=arraylistB.listIterator();
		System.out.println("ArrayList arraylistB -->");
		while(i2.hasNext()){
			System.out.println(i2.next() + " ");
		}
		System.out.println();
		System.out.println("Reverse List");

		while(i2.hasPrevious())
			System.out.println(i2.previous()+ " ");

		//Searching for an element in the ArrayList
		int index=arraylistB.indexOf("java");
		System.out.println(" 'java' was found at : "+index);
		int lastIndex=arraylistB.lastIndexOf("java");
		System.out.println(" 'java' was found" + "at:" +lastIndex + "from the last");
		System.out.println();
		System.out.println();
		//Sort an ArrayList
		Integer a[]={11,12,13,14,15};
		//converting Arrays into ArrayList
		List<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println("arrList" +arrlist.get(0));
	}
}
