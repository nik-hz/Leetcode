public class StairCounter {

    // memoization method
    public static int fib(int n, int[] ar) {
        if (n <= 1) ar[n] = 1;

        if (ar[n] != -1) {
            return ar[n];
        }

        ar[n] = fib(n - 1, ar) + fib(n - 2, ar);
        return ar[n];
    }

    public static int climbStairs(int n) {
        int[] ar = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            ar[i] = -1;
        }
        fib(n, ar);
        return ar[n];
    }

    // dp method

    public static int count(int n) {
        int[] dp = new int[n + 3];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        return dp[n + 1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(count(5));
    }
}
