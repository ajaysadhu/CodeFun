package com.saiyan;

public class StackImpl {

	private Node head;
	private Node tail;
	private static int pointer;


	private void increment()
	{
		pointer++;
	}
	
	public boolean push(Object data){
		if(tail==null && head ==null)
		{
			Node current = new Node(data);
			head=current;
			tail=current;
			increment();
			return true;
		}
		
		if(tail != head){
			Node thisNode = new Node(data);
			tail.setNext(thisNode);
			increment();
			return true;
		}
		
		else{
			Node currentNode = new Node(data);
			head.setNext(currentNode);
			tail=currentNode;
			increment();
			return true;
		}
		
		
	}
	
	
	public Object pop(){
		if(tail==null){
			return null;
		}
		
		if(head==tail){
			Object data = head.getNodeData();
			head=null;tail=null;
			decrement();
			return data;
			
		}
		else{
			Node currentNode=null;
			Node prevNode=null;
			currentNode = head;
			while(currentNode != tail){
				prevNode= currentNode;
				currentNode=currentNode.getNext();
			}
			Object data =tail.getNodeData();
			prevNode.setNext(null);
			tail=prevNode;
			decrement();
			return data;
		}
		
	}
	
	
	public boolean add(Object data)
	{
		if(data==null)
		{
			return false;
		}
		Node current = new Node(data);
		if(head ==null)
		{

			head =current;
			increment();
			return true;
		}
		else{
			Node prevNode= null,movingNode= null;
			
			movingNode = head; 
			while(movingNode != null){
				prevNode=movingNode;
				movingNode = movingNode.getNext();
			}
			prevNode.setNext(current);
			increment();
			return true;
		}
	}

	private void decrement(){
		pointer--;
	}
	public boolean remove()
	{
		if(head==null)
		{
			return false;
		}
		else{
			Node prevNode= null;
			Node currentNode=head;
			while(currentNode!=null){
				prevNode=currentNode;
				currentNode=currentNode.getNext();
				if(currentNode.getNext() != null)
				{
					continue;
				}
				else {break;}
				
			}
			prevNode.setNext(null);
			decrement();
			return true;
		}
		
	}
	
	public void printAll()
	{
		Node node = head;
		
		while(node != null){
			System.out.println(node.getNodeData());
			node=node.getNext();
		}
	}

	public static void main(String[] args) {
		
		StackImpl stack = new StackImpl();
		/*stack.add(1);
		stack.add("Ajay");
		stack.add(2);
		stack.add("Doshi");
		stack.add(3);
		stack.remove();
		stack.printAll();*/
		
		stack.push(1);
		stack.push("Ajay");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}

}
