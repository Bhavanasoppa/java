package com.day2;

import java.util.Scanner;

public class Farenheit {
	double f,c;
	private Scanner scan;
	void input()
	{
		scan = new Scanner(System.in);
		System.out.println("Enter a degree in Farenheit:");
		f=scan.nextDouble();
	}
	void convert()
	{
		c=((5*(f-32.0))/9.0);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Farenheit f=new Farenheit();
		f.input();
		f.convert();
	}
}
