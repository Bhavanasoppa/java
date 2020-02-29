package com.day3;

public class Array {
	void getData()
	{
	int a[]=new int[10];
	int b[]={10,9,8,7};
	a[0]=20;
	a[1]=30;
	a[2]=40;
	a[3]=50;
	a[4]=60;
	for(int i=0;i<b.length;i++)
		System.out.println(a[i]);
	for(int j:b)
		System.out.println(j);
	}
	public static void main(String[] args) {
		Array a=new Array();
        a.getData();
	}
}
