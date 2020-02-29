package com.day8;

import java.util.*;
public class loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]={21,49,7,99,31,29,33,42,81,94};
		for(int i=0;i<n.length;i++)
		{
			if(i%2!=0)
			{
				if(n[i]%2!=0)
				{
					System.out.println(n[i]);
				}
			}
		}

	}

}
