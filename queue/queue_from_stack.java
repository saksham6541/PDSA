package queue;
import java.util.*;

class MyQueue {

    Stack<Integer> input;
    Stack<Integer> output;

    MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // Enqueue
    public void push(int x) {
        input.push(x);
    }

    // Dequeue
    public int pop() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    // Front element
    public int top() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}