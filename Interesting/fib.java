package com.saiyan;

public class fib {

	static int[] array;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int j=1;
		array = new int[10];
		array[0]=1;
		array[1]=1;
		fibonocci(1);
		
		for(int k:array)
		System.out.println(k);
		
		for(int ii=0;ii<j;ii++){
			System.out.println("asfdsf "+ii);
		}
		
	}

	private static void fibonocci(int arrayIndex) {
		if(arrayIndex<array.length-1){
			arrayIndex++;
			array[arrayIndex]=array[arrayIndex-1]+array[arrayIndex-2];
			fibonocci(arrayIndex);
		}
		
		
	}

}
