package com.day3;

public class BubbleSort {
	public static int[] sort(int arr[])
	{
		int i,j,temp;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		int b[]={10,9,2,7,3,5,1};
	    int []c=sort(b);
	    for(int i=0;i<c.length;i++)
	    System.out.print(c[i] +"\t");
	    /*for(int j:c)
	    	System.out.print(j);*/
	}
}
