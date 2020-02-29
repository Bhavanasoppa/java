package com.day8;

import java.util.*;
public class Prime {
	
	public static void main(String args[])
	{
		//initializing variables
		
		int n=19,i,count=0;
		
		//condition to check whether given number is prime
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(n+ " is a prime number");
		else
			System.out.println(n+ " is not a prime number");
	}

}
