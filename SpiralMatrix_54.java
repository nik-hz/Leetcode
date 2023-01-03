import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0) return null;
        List<Integer> returnArray = new ArrayList<>();

        int rightBound = matrix[0].length - 1;
        int leftBound = 0;
        int lowerBound = matrix.length - 1;
        int upperBound = 0;

        while (returnArray.size() < matrix[0].length * matrix.length) {
            for (int i = leftBound; i <= rightBound; i++) {
                returnArray.add(matrix[upperBound][i]);
            }

            for (int i = upperBound + 1; i <= lowerBound; i++) {
                returnArray.add(matrix[i][rightBound]);
            }

            if (lowerBound != upperBound) {
                for (int i = rightBound - 1; i >= leftBound; i--) {
                    returnArray.add(matrix[lowerBound][i]);
                }
            }

            if (rightBound != leftBound) {
                for (int i = lowerBound - 1; i > upperBound; i--) {
                    returnArray.add(matrix[i][leftBound]);
                }
            }
            upperBound++;
            leftBound++;
            rightBound--;
            lowerBound--;
        }

        return returnArray;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix3 = {{2, 5, 8}, {4, 0, -1}};
        System.out.println(spiralOrder(matrix));
        System.out.println(spiralOrder(matrix2));
        System.out.println(spiralOrder(matrix2));
    }
}
