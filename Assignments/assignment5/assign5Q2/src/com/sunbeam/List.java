package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;

	List() {
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
		} else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else if (head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode=new Node(value);
		
		if(isEmpty()) {
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

	public int getData() {
		return head.data;
	}

	public void display() {
		if(isEmpty())
			return;
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != head);	
		System.out.println("");
	}
}
