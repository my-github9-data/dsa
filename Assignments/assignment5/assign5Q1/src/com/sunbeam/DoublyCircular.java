package com.sunbeam;

public class DoublyCircular {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;

	public DoublyCircular() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		}

		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode=new Node(value);
		
		if(isEmpty())
		{
			head=newnode;
			head.next=newnode;
			head.prev=newnode;
		}
		else
		{
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
		}
	}
	
	public void addPosition(int value,int pos)
	{
		Node newnode=new Node(value);
		
		if(isEmpty())
		{
			head=newnode;
			head.next=newnode;
			head.prev=newnode;
		}
		else {
			Node trav=head;
			for(int i=1;i<pos;i++)
				trav=trav.next;
			newnode.next=trav.next;
			newnode.prev=trav;
			trav.next=newnode;
			trav.next.prev=newnode;
		}
	}
	
	public void deletePosition(int pos)
	{
		if(isEmpty())
		 return;
		else {
			Node trav=head;
			for(int i=1;i<pos;i++)
				trav=trav.next;
			trav.next.prev=trav.prev;
			trav.prev.next=trav.next;
		}
			
	}
	
	public void display()
	{
		if(isEmpty())
		  return;
		
		Node trav=head;
		System.out.println("Forward list");
	do {
		System.out.print(" "+trav.data);
		trav=trav.next;
	}while(trav!=head);
	System.out.println("");
	}
	
	

}
