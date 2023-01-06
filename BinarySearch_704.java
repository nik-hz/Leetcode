public class BinarySearch_704 {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] t1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(t1, 13));
    }
}
