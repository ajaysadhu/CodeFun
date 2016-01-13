package com.saiyan;

import java.util.HashMap;
import java.util.LinkedList;

public class BreadthFirstSearch {

	Node root;
	LinkedList<Node> Queue;
	int counter;
	HashMap<Node, Boolean> visited;

	public BreadthFirstSearch(Node root) {
		this.root=root;
		Queue= new LinkedList<Node>();
		visited= new HashMap<Node, Boolean>();
	}

	private boolean isQueueEmpty(){
		if(Queue.size()>0){
			return true;
		}
		else
			return false;
	}


	void bfSearch(Node node, int search)
	{
		counter++;
		if(node !=null){
			if(node.getData()==search) 
				System.out.println("Value Found at: "+(counter-1));
			if(! (visited.get(node)))
				Queue.add(node);

			for(Node n: node.getChildren()){
				if(! (visited.get(node)))
					Queue.add(n);
			}
			Node removed=Queue.remove();
			visited.put(node, true);
			System.out.println(removed.getData());
			bfSearch(Queue.get(0), search);

		}
	}
	public static void main(String[] args){

	}

}
