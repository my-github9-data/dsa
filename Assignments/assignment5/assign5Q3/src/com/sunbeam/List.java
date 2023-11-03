package com.sunbeam;

public class List 
{
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
	
	
	public Node(int value)
	{ 
		data=value;
		next=null;
		prev=null;
		
	}
	}
	
 private Node head;
 private Node tail;
 
 public List()
 {
	 head=null;
	 tail=null;
 }
 
 public boolean isEmpty()
 {
	 return head==null && tail==null;
 }
 
 public void addFirst(int value)
 {
	 Node newnode=new Node(value);
	 
	 if(isEmpty()) {
		 head=tail=newnode;
	 }
	 else {
		 newnode.next=head;
		 head.prev=newnode;
		 head=newnode;
	 }
 }
 
 
 
 public void addLast(int value)
 {
	Node newnode=new Node(value);
	
	if(isEmpty())
		head=tail=newnode;
	else {
		newnode.prev=tail;
		tail.next=newnode;
		tail=newnode;
	}
			
 }
 
 public void deleteFirst()
 {
	 if(isEmpty())
       return;
	 else if(head.next==null)
		 head=tail=null;
	 else
	 {
		 head=head.next;
		 head.prev=null;
	 }
 } 
 
 public void display()
 {
	 if(isEmpty())
		 return;
	 else {
		 Node trav=head;
		 System.out.println("List:");
		 while(trav!=null) {
			 System.out.print(" "+trav.data);
			 trav=trav.next;
		 }
	 }
	 System.out.println("");
 }
}
