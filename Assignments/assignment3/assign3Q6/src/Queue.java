public class Queue {
	private int arr[];
	private int rear, front;
	private final int SIZE;

	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}

	public void push(int data) {
		if (rear == SIZE - 1) {
			throw new IllegalStateException("Queue is full");
		}

		rear++;
		arr[rear] = data;
	}
	public int size() {
		return rear+1;
	}
	public int pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}

		int data = arr[front + 1];
		front++;
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}

		return arr[front + 1];
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}

	public boolean isEmpty() {
		return rear == front;
	}
}
