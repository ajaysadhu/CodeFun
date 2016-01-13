package com.saiyan.algorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int arrr[] = {23,42,4,16,8,15,3,7,1,25};

		
		// Just check the adjacent elements and see they are sorted
		// For each iteration skip the last element - beacuse they are already sorted. 
		for (int i=0;i<arrr.length;i++)
		{
			int temp=0;
			int k=0;
			int j=arrr.length-1-i;
			while(k<j)
			{
				if(arrr[k]>arrr[k+1])
				{	temp=arrr[k];
					arrr[k]=arrr[k+1];
					arrr[k+1]=temp;
				}
				k=k+1;
			}
		}
		for (int l=0;l<arrr.length;l++)

			System.out.println(arrr[l]);
	}

}
