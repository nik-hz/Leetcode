import java.util.Stack;

public class QueueWithStacks_232 {

    public Stack<Integer> stack1 = new Stack<>();
    public Stack<Integer> stack2 = new Stack<>();

    public QueueWithStacks_232() {
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int value = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack1.pop());
        }
        return value;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int value = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack1.pop());
        }
        return value;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

}
