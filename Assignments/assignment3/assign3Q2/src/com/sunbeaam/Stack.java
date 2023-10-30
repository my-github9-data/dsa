package com.sunbeaam;

public class Stack {
	private int[] arr;
	private int top;
	private final int SIZE;
	private int max;

	public Stack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		this.top = -1;
		this.max = 0;
	}

	public void push(int data) {
		arr[++top] = data;
		if (max < data)
			max = data;
	}

	public int pop() {
		int ele;
		if (max != arr[top])
			ele = arr[top--];
		else {
			ele = arr[top--];
//			arr[top] = 0;
//			for (int i = 0; i < arr.length; i++)
			for (int i = 0; i < top; i++)
				if (max < arr[i])
					max = arr[i];
		}
		return ele;
	}

	public int peek() {
		return arr[top];
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

}
