package com.day6;

import java.io.*;
public class TestFileOutput {
void writeFile() throws IOException
{
	FileOutputStream fout=null;
	byte b[]=new byte[100];
	
	try
	{
		System.out.println("enter text");
		System.in.read(b);
		fout=new FileOutputStream("text3.txt");
		fout.write(b);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		fout.close();
	}
}

	public static void main(String[] args) throws IOException {
		TestFileOutput f=new TestFileOutput();
		f.writeFile();

	}

}
