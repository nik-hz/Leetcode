import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_409 {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int maxLength = 0;
        boolean middle = true;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0 && middle) {
                maxLength++;
                middle = false;
            }
            if (e.getValue() >= 2) {
                if (e.getValue() % 2 == 0) { // 2,4,6..
                    maxLength += e.getValue();
                    map.put(e.getKey(), 0);
                } else {
                    maxLength += e.getValue() - 1;
                    map.put(e.getKey(), 1);
                }
            }
        }
        System.out.println(map);
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabbcc"));
    }
}
