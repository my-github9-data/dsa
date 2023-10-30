package com.sunbeaam;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Stack st = new Stack(4);
		int choice;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. Max Element");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (st.isFull())
					System.out.println("\nStack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
				}
				break;
			case 2:
				if (st.isEmpty())
					System.out.println("\nStack is empty");
				else
					System.out.println("Poped Data = " + st.pop());
				break;
			case 3:
				if (st.isEmpty())
					System.out.println("\nStack is empty");
				else
					System.out.println("Peeked Data = " + st.peek());
				break;

			case 4:
				System.out.println("Max Element : \t" + st.getMax());
				break;
			}
		} while (choice != 0);

		sc.close();

	}

}
