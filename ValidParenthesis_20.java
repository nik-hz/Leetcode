import java.util.Stack;

public class ValidParenthesis_20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }
            if (stack.isEmpty() && (currentChar == ')' || currentChar == ']' || currentChar == '}')) {
                return false;
            }
            if (currentChar == ')' && stack.pop() != '(' ||
                    currentChar == '}' && stack.pop() != '{' ||
                    currentChar == ']' && stack.pop() != '[') {
                return false;
            }
        }

        // "){"
        // "()[]{}"

        return stack.isEmpty();
    }
}
