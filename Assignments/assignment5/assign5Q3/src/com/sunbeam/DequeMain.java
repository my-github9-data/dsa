package com.sunbeam;

public class DequeMain {

	public static void main(String[] args) {
		List l = new List();

		l.addLast(3);
		l.addLast(4);
		l.display();
		
		l.addFirst(1);
		l.addFirst(2);
		l.display();
		
		l.deleteFirst();
		l.deleteFirst();
		l.display();
		
		l.addFirst(10);
		l.display();

	}

}
