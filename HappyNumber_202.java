import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    public static int helper(int n) {
        int newNum = 0;
        while (n > 0) {
            newNum += (int) Math.pow(n % 10, 2);
            n = n / 10;
        }
        return newNum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            int newN = helper(n);
            set.add(n);
            n = newN;
        }
        return helper(n) == 1;

    }

    public static void main(String[] args) {
//        System.out.println(isHappy(2));
        System.out.println(isHappy(19));
    }
}
