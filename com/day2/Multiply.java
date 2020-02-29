package com.day2;

import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		int n,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=scan.nextInt();
		System.out.println("N\t N*10\t N*100\t N*1000");
		for(i=1;i<n;i++)
			System.out.println(i+"\t" +(i*10)+"\t" +(i*100)+"\t" +(i*1000));
	}
}
