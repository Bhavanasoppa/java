package com.day3;

public class CmdLineArgs {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
			if(i<3)
				System.out.println(args[i]);
			else
				break;
	} 
}
