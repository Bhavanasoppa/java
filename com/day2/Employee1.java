package com.day2;

public class Employee1 {
	int id;
	String name;
	void acceptData(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void displayData()
	{
		System.out.println(id);
		System.out.println(name);
    }	
	public static void main(String args[])
	{
		Employee1 e=new Employee1();
		e.acceptData(100,"Bhavana");
		e.displayData();
		Employee1 e2=new Employee1();
		e2.acceptData(107,"akanksha");
		e2.displayData();
	}
}
