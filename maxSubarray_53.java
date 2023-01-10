public class maxSubarray_53 {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        if (nums.length == 1) return nums[0];

        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i < nums.length; i++) {
            tempSum = tempSum + nums[i];
            if (maxSum < tempSum) {
                maxSum = tempSum;
            }
            if (tempSum < 0) {
                tempSum = 0;
            }
        }

        return maxSum;
    }
}
