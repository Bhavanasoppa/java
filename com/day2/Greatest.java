package com.day2;

public class Greatest {
    int a,b,c;
 void setValues()
 {
	 a=10;
	 b=20;
	 c=30;
 }
 int greatOfThree()
 {
	 int great;
	 great=(a>b)?(a>c?a:c):(b>c?b:c);
	 return great;
	 /*if(a>b&&a>c)
		 great=a;
	 else if(b>c)
		 great=b;
	 else
		 great=c;
	 return great;*/
 }
	public static void main(String[] args) 
	{
		Greatest g=new Greatest();
		g.setValues();
		/*int great=g.greatOfThree();
		System.out.println(great);*/
		System.out.println(g.greatOfThree());
	}
}
