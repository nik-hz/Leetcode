public class LongestPalindromeSubstr {

    public static String longestPalindrome(String s) {
        boolean[][] table = new boolean[s.length()][s.length()];

        int max = 1;
        // diagonal is true
        for(int i = 0; i < s.length(); i++){
            table[i][i] = true;
        }

        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                table[i][i+1] = true;
                start = i;
                max = 2;
            }
        }

        for(int k = 3; k <= s.length(); k++){

        }


        return null;
    }

    // hello
    // olleh

    public static void main(String[] args){
        String str = "hello";
        System.out.println(longestPalindrome(str));
    }
}
