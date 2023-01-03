public class canJump2_45 {

    public static int solution(int[] nums) {
        if (nums.length <= 1) return 0;
        if (nums[0] == 0) return 0;

        int lastIndex = nums.length - 1;
        int[] jumpsTaken = new int[nums.length];
        int jumps = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i + nums[i] == lastIndex) return 1;
            int currentPossibleJumps = nums[i];
            int maxJump = 0;
            for (int j = i + 1; j <= currentPossibleJumps && j < nums.length; j++) {

            }

        }
        return 1;
    }

    // 0  1  2  3  4
// 2, 3, 1, 1, 4
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int[] nums2 = {2, 3, 4, 1, 4};
        int[] nums3 = {0, 4};
        int[] nums4 = {1, 4};
        int[] nums5 = {0, 2, 3};
        int[] nums6 = {1, 0, 1, 0};

//        int[] nums = {200, 3, 140, 20, 10};
        System.out.println(solution(nums));
//        System.out.println(solution(nums2));
//        System.out.println(solution(nums3));
//        System.out.println(solution(nums4));
//        System.out.println(solution(nums5));
//        System.out.println(solution(nums6));
    }
}
