package com.saiyan;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int i=13;
		
		boolean prime =isPrime(i);
		
		if(prime){
			System.out.println(prime);
		}
		else{
			System.out.println("not prime");
		}
	}

	public static boolean isPrime(int number){
		
		if(number%2==0){
			return true;
		}
		int loop = number/2;
		for(int i=3;i<loop;i=i+2){
			if(number%i==0){
				return true;
			}
			
			
		}
		return false;
	}
}
