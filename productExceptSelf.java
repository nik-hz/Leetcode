public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        leftProd[0] = nums[0];
        rightProd[nums.length - 1] = nums[nums.length - 1];

        int j = nums.length - 2;
        for (int i = 1; i < nums.length; i++) {
            leftProd[i] = nums[i] * leftProd[i - 1];
            rightProd[j] = nums[j] * rightProd[j + 1];
            j--;
        }

        for (int i = 1; i < nums.length - 1; i++) {
            nums[i] = leftProd[i - 1] * rightProd[i + 1];
        }

        nums[0] = rightProd[1];
        nums[nums.length - 1] = leftProd[nums.length - 2];


        return nums;

    }

}
