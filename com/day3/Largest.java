package com.day3;

import java.util.Scanner;
public class Largest {
	int n;
	int great()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=scan.nextInt();
		int a[]=new int[n];
		int i,large;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the"+ i +"th value of the array");
			a[i]=scan.nextInt();
		}
		large=a[0];
		for(i=0;i<n;i++)
		{
			if(large<a[i])
				large=a[i];
		}
		return large;
	}
	public static void main(String[] args) {
		Largest l=new Largest();
		System.out.println(l.great());
	}
}
