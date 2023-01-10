import java.util.Arrays;

public class FloodFill_733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color,
                              int start) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return;

        if (image[sr][sc] != start) return;

        image[sr][sc] = color;

        helper(image, sr, sc + 1, color, start);
        helper(image, sr, sc - 1, color, start);
        helper(image, sr + 1, sc, color, start);
        helper(image, sr - 1, sc, color, start);
    }

    public static void main(String[] args) {
        int[][] img = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(floodFill(img, 1, 1, 2)));
    }
}
