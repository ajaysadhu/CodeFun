package com.saiyan;

public class Voting {
	
	String[] names = {"John","Mike","Ajay","Sadhu","google"};
	int[] votes = {50,32,80,10,15};
	
	String[] tempNames;
	int[] tempVotes;
	
	Voting(){
		tempNames=new String[5];
		tempVotes=new int[5];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//John 50
		//Mike 32
		//Ajay 80
		//Sadhu 10
		//google 15
		
		
		Voting voting = new Voting();
		voting.mergeSort(0,voting.votes.length-1);
		for(int i=0;i<voting.names.length;i++){
			System.out.println(voting.names[i]);
			System.out.println(voting.votes[i]);
		}
			
		System.out.println();

		
	}

	private  void mergeSort( int start, int end) {
		if(start<end){
		int middle = (start+end)/2;
		mergeSort(start, middle);
		mergeSort( middle+1, end);
		SortedMerge(start,middle,end);
		}
		
		
	}

	private void SortedMerge(int start, int middle, int end) {
		
		for(int i=0;i<tempVotes.length;i++){
			tempNames[i]=names[i];
			tempVotes[i]=votes[i];
		}
		
		int arrayIndex1 = start;
		int arrayEnd1 = middle;
		int arrayIndex2 = middle+1;
		int arrayEnd2 = end;
		int i=start;
		while(arrayIndex1<=arrayEnd1 && arrayIndex2 <= arrayEnd2){
			if(tempVotes[arrayIndex1] <= tempVotes[arrayIndex2]){
				votes[i]=tempVotes[arrayIndex2];
				names[i]=tempNames[arrayIndex2];
				i++;
				arrayIndex2++;
			}
			else{
				votes[i]=tempVotes[arrayIndex1];
				names[i]=tempNames[arrayIndex1];
				i++;
				arrayIndex1++;
			}
			
			while(arrayIndex1<=arrayEnd1){
				votes[i]=tempVotes[arrayIndex1];
				names[i]=tempNames[arrayIndex1];
				i++;
				arrayIndex1++;
			}
			
			while(arrayIndex2<=arrayEnd2){
				votes[i]=tempVotes[arrayIndex2];
				names[i]=tempNames[arrayIndex2];
				i++;
				arrayIndex2++;
			}
				
		}
		
		
	}
	
	

}
