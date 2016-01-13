package com.saiyan;

import java.util.ArrayList;



//Lets take array
//n is the node, 2n+1 will be left node and 2n+2 will be right node
// we are assuming tree to be fully complete or almost complete
// start value is 0 
public class DepthFirstSearch {
	private int dfs[];

	private boolean visited[] ;

	public DepthFirstSearch(int[] array){
		this.dfs=array;
		visited= new boolean[array.length];
	}

	public void dfSearch(int index, int value){
		if(dfs[index]==value){
			System.out.println("Index is: "+index);

		}
		visited[index]=true;
		int left=2*index+1;
		int right =2*index+2;
		if(left<=dfs.length-1){
			if(visited[left]){

			}
			else{
				dfSearch(left, value);
			}
		}
		if(right<=dfs.length-1)
		{
			if(visited[right]){

			}
			else{
				dfSearch(right, value);
			}
		}





	}

	public static void main(String[] args) {

		int[] array ={8,1,6,2,3,5,4,9};
		DepthFirstSearch search = new DepthFirstSearch(array);
		search.dfSearch(0,9);
		//System.out.println("Searched INdex: "+l);

	}

}
