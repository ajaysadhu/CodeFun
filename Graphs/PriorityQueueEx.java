package com.saiyan;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	


static class RollNumber implements Comparable<RollNumber>{

	 int rollnumber;
	 
	 RollNumber(int k){
		 this.rollnumber=k;
	 }
	@Override
	public int compareTo(RollNumber o) {
		if(rollnumber<o.rollnumber){
			return -1;
		}
		else if (rollnumber > o.rollnumber){
			return 1;
		}
		return 0;
	}
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RollNumber r1 = new RollNumber(10);
		RollNumber r2 = new RollNumber(20);
		RollNumber r3 = new RollNumber(5);
		RollNumber r4 = new RollNumber(1);
		RollNumber r5 = new RollNumber(51);
		RollNumber r6 = new RollNumber(16);
		RollNumber r7 = new RollNumber(20);
		
		PriorityQueue<RollNumber> priority = new PriorityQueue<PriorityQueueEx.RollNumber>();
		priority.add(r1);
		priority.add(r2);
		priority.add(r3);
		priority.add(r4);
		priority.add(r5);
		priority.add(r6);
		priority.add(r7);
		
		while(!priority.isEmpty()){
			System.out.println(priority.poll().rollnumber);
			
		}
		
	}

}
