import java.util.Arrays;

public class WhereWillTheBallFall_1706 {
    public static int[] findBall(int[][] grid) {
        int[] solution = new int[grid[0].length];

        // go across the grid
        for (int i = 0; i < grid[0].length; i++) {
            int x = i;
            // traverse down the grid
            for (int y = 0; y <= grid.length; y++) {
                if (y == grid.length) {
                    solution[i] = 1;
                    break;
                }
                int currentDirection = grid[y][x];
                if (currentDirection < 0 && x == 0) {
                    solution[i] = -1;
                    break;
                } else if (currentDirection > 0 && x == grid[0].length - 1) {
                    solution[i] = -1;
                    break;
                }

                int nextDirection = grid[y][x + 1];


                if (currentDirection < 0) {
                    x--;

                } else {
                    x++;
                }
            }

        }
        return solution;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1,
                -1, -1, -1, -1}};
        System.out.println(Arrays.toString(findBall(grid1)));
    }

}
