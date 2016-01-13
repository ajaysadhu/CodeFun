package com.saiyan;
/*
*
* Finding if the number can be represented as sum of squares of other two numbers
* Eg: 13 = (3*3) + (2*2)
* 
*/


public class SumOfSquares {

private int number;

SumOfSquares(int n){
	this.number=n;
}

public double findSuareRoot(){
	
	
	return Math.sqrt(number);
	
}

public double findSuareRoot(int localnumber){
	
	
	return Math.sqrt(localnumber);
	
}

public boolean isWholeNumber(double num){
	if(num<1){
		return false;
	}
	int check = (int) num;
	
	if(check==num){
		return true;
	}
	else{
		return false;
	}
	
}

public boolean  isSumofSquared(){
	int n=(int)findSuareRoot(this.number);
	int temp;
	for(int i=n;i>0;i--){
		temp = number-(i*i);
		if(isWholeNumber(findSuareRoot(temp))){
			return true;			
		}
	}
	return false;
}

public static void main(String[] args){
	SumOfSquares s = new SumOfSquares(6570);
	boolean sumof2Squares=s.isSumofSquared();
	System.out.println(sumof2Squares);
}

}
