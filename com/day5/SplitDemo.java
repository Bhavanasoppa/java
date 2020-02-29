package com.day5;

import java.io.*;
public class SplitDemo {

	public static void main(String[] args) {
		String str = new String("Welcome-to-Webninar");
		System.out.println("Return value:");
		
		for(String retreval:str.split("-")){
			System.out.println(retreval);
		}
		/*String wds[]=str.split("-");
		for(int i=0;i<wds.length;i++)
			System.out.println(wds[i]);*/
	}

}
