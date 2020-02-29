package com.day5;

import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;
public class Mtaching {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scan.nextLine();
		/*Pattern mypattern=Pattern.compile(".*(jim|joe).*", Pattern.CASE_INSENSITIVE);*/
		Pattern mypattern=Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]{2,3}");
			 Matcher matcher=mypattern.matcher(s);
			 System.out.println(matcher.matches());
			 
	}

}

