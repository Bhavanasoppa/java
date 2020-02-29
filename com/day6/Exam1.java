package com.day6;

import java.util.ArrayList;
import java.util.Collections;
public class Exam1 {
	String arr[]={"Bhavana","Lohitha","Tharun","Chanti","Kavya"};
	ArrayList<String> arraylist=new ArrayList<String>();
	ArrayList acceptNames()
	{
		for(int i=0;i<arr.length;i++)
		{
			arraylist.add(arr[i]);
		}
		return arraylist;
	}
	void unsortedList()
	{
		System.out.println(arraylist);
	}
	void sortedList()
	{
		Collections.sort(arraylist);
		System.out.println(arraylist);
	}
	
	

	public static void main(String[] args) {
		Exam1 e=new Exam1();
		ArrayList<String> arraylist2=e.acceptNames();
		e.unsortedList();
		e.sortedList();

	}

}
