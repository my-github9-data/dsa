package com.sunbeam;

public class Stack {
	private int[] arr;
	private int top;
	private final int SIZE;

	public Stack(int size) {
		this.SIZE = size;
		this.arr = new int[SIZE];
		this.top = -1;
	}

	public void push(int data) {
		arr[++top] = data;
	}

	public int pop() {
		return arr[top--];
	}

	public int peek() {
		return arr[top];
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
