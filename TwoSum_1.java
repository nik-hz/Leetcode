import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                solution[0] = i;
                solution[1] = map.get(diff);
            }
            map.put(nums[i], i);
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] ar1 = {3, 3};
        System.out.println(Arrays.toString(twoSum(ar1, 6)));
    }

}
