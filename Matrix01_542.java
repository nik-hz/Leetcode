public class Matrix01_542 {
    public int[][] updateMatrix(int[][] mat) {
        int colLength = mat[0].length;
        int rowLength = mat.length;

        int max = colLength + rowLength;

        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (mat[row][col] == 0) continue;
                int top = max, left = max;
                if (row > 0) top = mat[row - 1][col];
                if (col > 0) left = mat[row][col - 1];
                mat[row][col] = Math.min(top, left) + 1;
            }
        }

        for (int row = rowLength - 1; row >= 0; row--) {
            for (int col = colLength - 1; col >= 0; col--) {
                if (mat[row][col] == 0) continue;
                int bottom = max, right = max;
                if (row < rowLength - 1) bottom = mat[row + 1][col];
                if (col < colLength - 1) right = mat[row][col + 1];
                mat[row][col] = Math.min(mat[row][col], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
}
