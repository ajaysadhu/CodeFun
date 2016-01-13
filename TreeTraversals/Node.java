package com.saiyan;

import java.util.LinkedList;

public class Node {
	private int data;
	private LinkedList<Node> children;

	Node(int value){
		data=value;
		children=null;
	}
	Node(int value, LinkedList<Node> child){
		data=value;
		children = child;
	}
	
	public LinkedList<Node> getChildren(){
		return children;
	}
	
	public int getData()
	{
		return data;
	}

	
}
