package com.sunbeam;

public class LinkedListMain {

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		s.pop();
		s.peek();
		s.display();
		
		System.out.println("Stack");
		
		Queue q=new Queue();
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.display();
		q.pop();
		q.peek();
		q.display();
		
		System.out.println("Queue");
       
        
		
	}

}
