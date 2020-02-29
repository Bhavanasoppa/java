package com.day7;

import java.util.*;
import java.io.*;
/*import java.io.BufferedReader;*/
public class FileWriterDemo {

	public static void main(String[] args)throws IOException {
		try
		{
			FileWriter fw=new FileWriter("out.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("too much code");
			bw.close();
		}
		catch(EOFException e)
		{
			System.err.println(e);
		}
	}
	public void writeFile()
	{
		Scanner scan=new Scanner(System.in);
		String s=" ";
		try
		{
			while(!s.equals("q"));
			s=scan.nextLine();
			if(!s.equals("q"))
			{
				BufferedWriter bw;
				bw.write(s);
				bw.newLine();
			}
		}
	}
}










































