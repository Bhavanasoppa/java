package com.day2;

import java.util.Scanner;
public class Armstrong 
{
	int n,a,temp;
	private Scanner scan;
	void check()
	{
		int c=0;
		scan=new Scanner(System.in);
		System.out.println("enter a number");
		n=scan.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("given number is armstrong");
		else
			System.out.println("given number is not armstrong");
	}

	public static void main(String[] args)
	{
		Armstrong a=new Armstrong();
		a.check();
	}
}
