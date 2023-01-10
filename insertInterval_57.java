import java.util.Arrays;
import java.util.Stack;

public class insertInterval_57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            int[][] returnArray = new int[1][2];
            returnArray[0] = newInterval;
            return returnArray;
        }

        int[][] solution = new int[intervals.length + 1][2];

        System.arraycopy(intervals, 0, solution, 0, intervals.length);
        solution[solution.length - 1] = newInterval;

        for (int i = solution.length - 1; i >= 0; i--) {
            if (newInterval[0] < solution[i][0]) {
                solution[i + 1] = solution[i];
                solution[i] = newInterval;
            }
        }

//        System.out.println(Arrays.deepToString(solution));

        Stack<int[]> stack = new Stack<>();
        stack.push(solution[0]);

        for (int i = 1; i <= solution.length - 1; i++) {
            if (solution[i][0] <= stack.peek()[1]) {
                int[] temp = stack.pop();
                temp[1] = Math.max(temp[1], solution[i][1]);
                stack.push(temp);
            } else {
                stack.push(solution[i]);
            }
        }

        int[][] returnArray = new int[stack.size()][2];

        for (int i = stack.size() - 1; i >= 0; i--) {
            returnArray[i] = stack.pop();
        }

        return returnArray;

    }

    public static void main(String[] args) {
        int[][] t1 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] int1 = {4, 8};
        System.out.println(Arrays.deepToString(insert(t1, int1)));
    }
}
