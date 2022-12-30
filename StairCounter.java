public class StairCounter {
    public static int fib(int n){
        if(n < 2) return n;
        return fib(n - 1) + fib(n-2);
    }
    public static int climbStairs(int n) {
        return fib(n+1);
    }

    public static void main(String[] args){
        System.out.println(climbStairs(15));
    }
}
