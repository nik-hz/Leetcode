public class HouseRobber198 {

    public static int solution(int[] nums) {
        if (nums.length == 0) return 0;
        int[] maxAmt = new int[nums.length];

        maxAmt[0] = nums[0];
        maxAmt[1] = Math.max(nums[1], nums[0]);

        for (int i = 2; i < nums.length; i++) {
            maxAmt[i] = Math.max(maxAmt[i - 1], maxAmt[i - 2] + nums[i]);
        }

        return maxAmt[nums.length - 1];


    }

    public static void main(String[] args) {
        int[] nums = {200, 3, 140, 20, 10};
        System.out.println(solution(nums));
    }
}
