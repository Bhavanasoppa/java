package com.day3;

import java.util.Scanner;
public class InputDemo 
{
	int id;
    String name;
	 
	void acceptData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id");
		id=scan.nextInt();
		System.out.println("Enter name");
		name=scan.next();
	}
	void displayData()
	{
		System.out.println(id);
		System.out.println(name);
    }	

	public static void main(String[] args)
	{
		InputDemo ip=new InputDemo();
		ip.acceptData();
		ip.displayData();
	}
}
