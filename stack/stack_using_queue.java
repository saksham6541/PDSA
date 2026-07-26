import java.util.*;

class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        for (int i = 0; i < queue.size(); i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}