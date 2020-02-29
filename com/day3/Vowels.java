package com.day3;
import java.util.Scanner;
public class Vowels {
	String sentence;
	void getData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		sentence=scan.nextLine();
	}
	void count()
	{
		int i,count=0,acount=0,ecount=0,icount=0,ocount=0,ucount=0;
		for(i=0;i<sentence.length();i++)
		switch(sentence.charAt(i))
		/*char c=sentence.toLowercase().charAt(i);
		switch(c)*/
		{
		case 'a':
			acount++;
			count++;
			break;
		case 'e':
			ecount++;
			count++;
			break;
		case 'i':
			icount++;
			count++;
			break;
		case 'o':
			ocount++;
			count++;
			break;
		case 'u':
			ucount++;
			count++;
			break;
		}
		System.out.println("Totl no.of vowels=" + count);
		System.out.println("total no.of a's=" + acount);
		System.out.println("total no.of e's=" + ecount);
		System.out.println("total no.of i's=" + icount);
		System.out.println("total no.of o's=" + ocount);
		System.out.println("total no.of u's=" + ucount);
	}
 

	public static void main(String[] args) {
		Vowels v=new Vowels();
		v.getData();
		v.count();
		}
}
