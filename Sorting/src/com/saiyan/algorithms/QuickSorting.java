package com.saiyan.algorithms;

public class QuickSorting {

	public static void main(String[] args)
	{
		int arr[]={9,8,7,6,5,4,3,2};
		//System.out.println(arr.length);
		QuickSort(arr,0,arr.length-1);

		for (int i: arr)
			System.out.println(i);
	}

	private static void QuickSort(int[] arr,int start, int end)
	{
		if(start<end)
		{
			int partitionIndex = Partition(arr,start,end);
			QuickSort(arr, start, partitionIndex-1);
			QuickSort(arr, partitionIndex+1,end);
		}

	}
	private static int Partition(int[] arr,int start,int end)
	{


		int pivot=arr[end];
		int partitionIndex =start;

		for (int current=start;current<end;current++)
		{
			if(arr[current]<= pivot)
			{
				swap(arr,current,partitionIndex);
				partitionIndex++;
			}
		}
		swap(arr, partitionIndex, end);
		return partitionIndex;

	}


	private static void swap(int[] arr, int partitionIndex, int end) {
		int temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end]=temp;
	}
}
