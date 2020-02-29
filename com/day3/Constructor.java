package com.day3;

public class Constructor {
		int id;
	    String name;
		 Constructor(int id,String name)
		 {
			 this.id=id;
			 this.name=name;
		 }
		void displayData()
		{
			System.out.println(id);
			System.out.println(name);
	    }	

		public static void main(String[] args)
		{
			Constructor c=new Constructor(124,"Bhavana");
			c.displayData();
		}
	}

