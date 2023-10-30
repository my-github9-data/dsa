package com.sunbeam;

public class StringStack {
	private String[] arr;
	private int top;
	private final int SIZE;

	public StringStack(int size) {
		this.SIZE = size;
		this.arr = new String[SIZE];
		this.top = -1;
	}

	public void push(String c) {
		arr[++top] = c;
	}

	public String pop() {
		return arr[top--];
	}

	public String peek() {
		return arr[top];
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
