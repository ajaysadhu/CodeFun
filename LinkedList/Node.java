package com.saiyan;

public class Node {
	
	private Node next;
	private Object data;
	
		
	Node(Object value)
	{
		this.data=value;
		next= null;
	}	
	
	Node(Node otherNode, Object value)
	{
		this.data=value;
		next= otherNode;
	}	
	
	public Node getNext(){
		return next;
	}
		
	public Object getNodeData(){
		return data;
	}
	
	public void setNext(Node node){
		next=node;
	}
		
	public void setNodeData(Object value){
		data=value;
	}
	
	
	

}
