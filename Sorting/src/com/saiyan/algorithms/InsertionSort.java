package com.saiyan.algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		//create an array
		int[] arr={8,1,3,9,5,6,4};

		insertionsorting(arr);
		for( int i :arr)
			System.out.println(i);


	}

	private static void insertionsorting(int[] arr)
	{

		int end =arr.length-1;
		int key ;
		int j;

		for (int i=1;i<=end;i++)
		{
			j=i;
			key =arr[i];
			// Moving Elements to the right so that at the end element will be inserted in the position suited.
			// Insert the element to the correct position
			// Best Case: Omega (n)
			// Worst Case: Order (n-square) Sum of : 1+2+3...+n-1
			while (j>0 && arr[j-1] > key)
			{
				arr[j] = arr[j-1];
				j=j-1;
			}
			arr[j] = key;

		}


	}

}
