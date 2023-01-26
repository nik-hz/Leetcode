public class numIslands {
    public static void dfs(char[][] grid, int row, int col) {
        if (row < grid.length && col < grid[0].length && row >= 0 && col >= 0) {
            if (grid[row][col] == '1') {
                grid[row][col] = 's';
                dfs(grid, row + 1, col);
                dfs(grid, row - 1, col);
                dfs(grid, row, col + 1);
                dfs(grid, row, col - 1);
            }
        }
    }

    public static int nums(char[][] grid) {
        int firstPass = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    firstPass++;
                }
            }
        }
        return firstPass;
    }

    public static void main(String[] args) {
        char[][] t = {
                {'1', '1', '1', '1', '0' },
                {'1', '1', '0', '1', '0' },
                {'1', '1', '0', '0', '0' },
                {'0', '0', '0', '0', '0' }};
        char[][] t2 = {
                {'1', '1', '1', '0', '0' },
                {'1', '1', '0', '1', '0' },
                {'1', '1', '0', '0', '0' },
                {'0', '0', '0', '0', '1' }};
        System.out.println(nums(t));
        System.out.println(nums(t2));
    }
}
