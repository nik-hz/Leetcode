import java.util.Stack;

public class reversePolish_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            } else {
                int second = stack.pop();
                int first = stack.pop();

                switch (s) {
                    case "+" -> stack.push(first + second);
                    case "-" -> stack.push(first - second);
                    case "*" -> stack.push(first * second);
                    case "/" -> stack.push(first / second);
                }
            }
        }
        return stack.pop();
    }
}
