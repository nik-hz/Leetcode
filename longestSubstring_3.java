public class longestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {

        int[] solution = new int[179];

        int tempSum = 0;
        int maxSum = 0;

        int rearIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i);
            solution[temp % 179] += 1;
            tempSum++;
            if (solution[temp % 179] == 1) {
                if (tempSum > maxSum) maxSum = tempSum;
            } else {
                for (int j = rearIndex; j < i; j++) {
                    int rearChar = s.charAt(j);
                    solution[rearChar % 179] -= 1;
                    tempSum--;
                    if (solution[rearChar % 179] == 1) {
                        rearIndex = j + 1;
                        break;
                    }
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
