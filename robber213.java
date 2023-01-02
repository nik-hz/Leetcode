public class robber213 {

    public static int solution(int[] nums) {

        int[] maxAmt = new int[nums.length];


        maxAmt[0] = nums[0];
        maxAmt[1] = Math.max(nums[1], nums[0]);

        for (int i = 2; i < nums.length; i++) {
            maxAmt[i] = Math.max(maxAmt[i - 1], maxAmt[i - 2] + nums[i]);
        }

        return maxAmt[nums.length - 1];
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length <= 2) return Math.max(nums[1], nums[0]);
        int[] first = new int[nums.length - 1];
        int[] last = new int[nums.length - 1];

        System.arraycopy(nums, 0, first, 0, nums.length - 1);
        System.arraycopy(nums, 1, first, 0, nums.length - 1);

        return Math.max(solution(first), solution(last));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {200, 3, 140, 20, 10};
        System.out.println(rob(nums));
    }
}
