public class StackUsingQueue {
    private Queue q1;
    private Queue q2;

    public StackUsingQueue(int capacity) {
        q1 = new Queue(capacity);
        q2 = new Queue(capacity);
    }

    void push(int data) {
        if (q1.isFull()) {
            throw new IllegalStateException("Stack is full");
        }

        // Push the new element onto q1
        q1.push(data);
    }

    int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move elements from q1 to q2, except the last one
        while (q1.size() > 1) {
            q2.push(q1.pop());
        }

     // Pop and return the last element in q1 (simulating stack behavior)
        int result = q1.pop();

        // Swap q1 and q2 to make q2 the primary queue
        Queue temp = q1;
        q1 = q2;
        q2 = temp;

        return result;    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.pop()); // Output: 1
    }
}
