package com.day6;

import java.io.*;

public class FileInput {
	void readFile()throws IOException
	{
		//FileInputStream f=null;
		BufferedInputStream bis=null;
		byte b[]=new byte[15];
		
		try
		{
			 bis=new BufferedInputStream(new FileInputStream("text3.txt"));
			bis.read(b);
			bis.close();
			/*f=new FileInputStream("text3.txt");
			f.read(b);*/
			String str=new String(b);
			
			System.out.println(str.trim());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			bis.close();
		}
	}

	public static void main(String[] args) throws IOException {
		FileInput a=new FileInput();
		a.readFile();
		

	}

}
