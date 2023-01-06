import java.util.Stack;

public class isPalindrome_125 {
    public static boolean solution(String s) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                temp.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        s = temp.toString();
        Stack<Character> stack = new Stack<>();
        // 3 -> 1 a b a
        // 4 -> 2 a b b a
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            stack.push(s.charAt(i));
        }

        if (s.length() % 2 == 0) {
            for (int j = s.length() / 2; j < s.length(); j++) {
                if (stack.pop() != s.charAt(j)) return false;
            }
        } else {
            for (int j = s.length() / 2 + 1; j < s.length(); j++) {
                if (stack.pop() != s.charAt(j)) return false;
            }
        }

        return true;
    }
}
