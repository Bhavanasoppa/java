package com.day2;


public class Employee {
		int id;
		String name;
		void acceptData()
		{
			id=100;
			name="Bhavana";
		}
		void displayData()
		{
			System.out.println(id);
			System.out.println(name);
	    }	
		public static void main(String args[])
		{
			Employee e=new Employee();
			e.acceptData();
			e.displayData();
		}
}

