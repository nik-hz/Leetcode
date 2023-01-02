public class canJump55 {
    public static boolean solution(int[] nums) {
        if (nums.length <= 1) return true;
        if (nums[0] == 0) return false;
        for (int i = nums.length - 1; i >= 0; i--) {
            int currentIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                int jIndex = j;
                int possibleJump = nums[j];
                if (possibleJump + jIndex >= currentIndex) {
                    i = j;
                    i++;
                    break;
                } else if (jIndex == 0) {
                    return false;
                }

            }
        }
        return true;
    }

    // 0  1  2  3  4
// 2, 3, 1, 1, 4
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};
        int[] nums3 = {0, 4};
        int[] nums4 = {1, 4};
        int[] nums5 = {0, 2, 3};
        int[] nums6 = {1, 0, 1, 0};

//        int[] nums = {200, 3, 140, 20, 10};
//        System.out.println(solution(nums));
//        System.out.println(solution(nums2));
//        System.out.println(solution(nums3));
//        System.out.println(solution(nums4));
//        System.out.println(solution(nums5));
        System.out.println(solution(nums6));
    }
}
