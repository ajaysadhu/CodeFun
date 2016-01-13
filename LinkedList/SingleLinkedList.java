package com.saiyan;

import java.util.LinkedList;

public class SingleLinkedList {


	/*
	 * Linked List
	 * 1) Head, Tail= NULL
	 * 2) (Data, Reference to next Node) -> Node
	 * 3) Define Head, When a new element is added -> add a new node : Similar stuff for remove
	 * 
	 * */
	private static int counter;
	private Node head;

	SingleLinkedList(){
	}

	public int getSize(){
		return counter;
	}

	public void incrementCounter(){
		counter++;
	}

	void add(Object data)
	{
		if(head==null)
		{
			head= new Node(data);
			incrementCounter();
		}
		else{

			Node CurrentNode= head;
			Node PrevNode = null;
			Node newNode = new Node(data);
			while(CurrentNode != null){
				PrevNode=CurrentNode;
				CurrentNode=CurrentNode.getNext();
			}
			PrevNode.setNext(newNode);
			incrementCounter();
		}
	}

	public void  decrement()
	{
		counter--;
	}
	public boolean remove(int index){
		if(index+1 <=getSize())
		{

			if(index==0)
			{
				head = head.getNext();
				return true;
			}
			else{
				Node current = head;
				Node prevNode=null;
				int counter=0;
				while(index > counter && current != null){
					prevNode=current;
					current=current.getNext();
					counter++;
				}

				prevNode.setNext(current.getNext());
				decrement();
				return true;
			}
		}

		else return false;
	}

	public Object getElement(int index)
	{
		int pointer=0;
		
		if(index+1<= getSize())
		{
			Node current = head;
			while(pointer< index && current != null){
				current=current.getNext();
				pointer ++;
				
			}
			return current.getNodeData();
		}
		else
			return null;
	}
	
	public boolean insertNode(int index, Object data)
	{
		if(index +1 <= getSize())
		{
			if(index==0){
				Node initNode=new Node(data);
				initNode.setNext(head);
				head=initNode;
				incrementCounter();
				return true;
			}
			Node currentNode = head;
			Node prevNode=null;
			Node myNode = new Node(data);
			int pointer=0;
			while(currentNode !=null && pointer <index)
			{
				prevNode=currentNode;
				currentNode=currentNode.getNext();
			}
			prevNode.setNext(myNode);
			myNode.setNext(currentNode);
			incrementCounter();
			return true;
			
		}
		else return false;
	}


	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		SingleLinkedList sl = new SingleLinkedList();
		sl.add(1);
		sl.add(2);
		sl.add(3);

		//sl.remove(2);
		
		System.out.println(sl.insertNode(0, 100));
		System.out.println(sl.getSize());
		
		System.out.println(sl.getElement(0));

	}

}
