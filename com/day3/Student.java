package com.day3;

import java.util.Scanner;
public class Student {
	int id;
	String name;
	void acceptData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id");
		id=s.nextInt();
		System.out.println("Enter Name");
		name=s.next();
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Student stud[]=new Student[3];
		for(int i=0;i<3;i++)
		{
			stud[i]=new Student();
			stud[i].acceptData();
		}
		for(int i=0;i<3;i++)
		{
			stud[i].display();
		}
	}
}
