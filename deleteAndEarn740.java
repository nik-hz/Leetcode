import java.util.Arrays;
import java.util.HashMap;

public class deleteAndEarn740 {

//    public static int deleteAndEarn(int[] nums) {
//        if (nums.length == 0) return 0;
//
//
//        Arrays.sort(nums);
//
//        int count = 0;
//        int last = 0;
//        for (int num : nums) {
//            if (num > last) {
//                count++;
//                last = num;
//            }
//        }
//
//        int[] sums = new int[count];
//        int[] vals = new int[count];
//        int idx = 0, current = nums[0], sum = 0;
//        for (int num : nums) {
//            if (num > current) {
//                vals[idx] = current;
//                sums[idx++] = sum;
//                sum = 0;
//                current = num;
//            }
//            sum += num;
//        }
//        sums[idx] = sum;
//        vals[idx] = current;
//
//        int min = vals[0], max = vals[vals.length - 1];
//
//        int[] sumsZeros = new int[max + 1];
//
//        for (int i = 0; i < vals.length; i++) {
//            sumsZeros[vals[i]] = sums[i];
//        }
//
//
//        int[] maxAmt = new int[sumsZeros.length];
//
//        maxAmt[0] = sumsZeros[0];
//        maxAmt[1] = Math.max(sumsZeros[1], sumsZeros[0]);
//
//        for (int i = 2; i < sumsZeros.length; i++) {
//            maxAmt[i] = Math.max(maxAmt[i - 1], maxAmt[i - 2] + sumsZeros[i]);
//        }
//
//        return maxAmt[maxAmt.length - 1];
//    }

    public static HashMap<Integer, Integer> map = new HashMap<>();
    public static HashMap<Integer, Integer> dp = new HashMap<>();

    public static int deleteAndEarn(int[] nums) {
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + num);
        }

        return 0;
    }


    public static void main(String[] args) {
        int[] nums = {3, 4, 2};
//        int[] nums = {200, 3, 140, 20, 10};
        System.out.println(deleteAndEarn(nums));
    }
}
