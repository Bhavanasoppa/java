package com.day4;

import java.util.Random;
public class Trail {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println((char) (r.nextInt(26)+65));
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
	}

}
