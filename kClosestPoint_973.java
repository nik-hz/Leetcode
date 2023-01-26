import java.util.Arrays;

public class kClosestPoint_973 {

    public static double dist(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }

    private static void swap(int[][] points, int i, int j) {
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

    public static int partition(int[][] points, int low, int high) {
        int[] pivot = points[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (dist(points[j]) < dist(pivot)) {
                i++;
                swap(points, i, j);
            }
        }
        swap(points, i + 1, high);
        System.out.println(Arrays.deepToString(points));
        return i + 1;
    }

    public static void quickSort(int[][] points, int low, int high) {
        if (low < high) {
            int mid = partition(points, low, high);
            quickSort(points, low, mid - 1);
            quickSort(points, mid + 1, high);
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        quickSort(points, 0, points.length - 1);
        int[][] solution = new int[k][2];
        for (int i = 0; i < k; i++) {
            solution[i] = points[i];
        }
        return solution;
    }

    public static void main(String[] args) {
        int[][] t1 = {{-2, -6}, {-7, -2}, {-9, 6}, {10, 3}, {-8, 1}, {2, 8}};
        System.out.println(Arrays.deepToString(kClosest(t1, 5)));
    }
}
