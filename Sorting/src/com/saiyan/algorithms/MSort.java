package com.saiyan.algorithms;

public class MSort {

	 int[] unsorted ;
	 int[] tempArray;
	 
	 MSort(int[] array){
		 this.unsorted=array;
		 tempArray=new int[array.length];
		 MergeSort( 0, array.length-1);
	 }
	public static void main(String[] args) {

		//Descending
		

		int [] array={3,6,2,8,1,5,9,15,4} ;
		MSort msort=new MSort(array);
		for(int i:msort.unsorted){
			System.out.println(i);
		}
	}

	private  void MergeSort( int start, int end)
	{
		if(start<end){
			int leftIndex=start;
			int middle=(start+end)/2;
			MergeSort( leftIndex,middle);
			MergeSort(middle+1, end);
			SortedMerge(leftIndex,middle,end);

		}
	}

	private  void SortedMerge(int start, int middle,int end){
				
		for(int i=start;i<=end;i++){
			tempArray[i]=unsorted[i];
		}
		
		int arrayIndex1=start;
		int arrayEndIndex1=middle;
		int arrayIndex2=middle+1;
		int arrayIndexEnd2=end;
		int i=start;
		while(arrayIndex1<=arrayEndIndex1 && arrayIndex2<=arrayIndexEnd2){
			if(tempArray[arrayIndex1]<= tempArray[arrayIndex2]){
				unsorted[i]=tempArray[arrayIndex2];
				i++;
				arrayIndex2++; 
			}
			else{
				unsorted[i]=tempArray[arrayIndex1];
				i++;
				arrayIndex1++;
			}
		}
		
		while(arrayIndex1<=arrayEndIndex1){
			unsorted[i]=tempArray[arrayIndex1];
			i++;arrayIndex1++;
		}
		while(arrayIndex2<=arrayIndexEnd2){
			unsorted[i]=tempArray[arrayIndex2];
			i++;arrayIndex2++;
		}

	}

} 	
