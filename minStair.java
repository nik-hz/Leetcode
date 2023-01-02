public class minStair {

    public static int min(int[] cost) {
        int[] valRow = new int[cost.length + 1];
        for (int i = 2; i < valRow.length; i++) {
            int oneStep = valRow[i] + cost[i - 1];
            int twoStep = valRow[i] + cost[i - 2];
            valRow[i] = Math.min(oneStep, twoStep);
            System.out.println(valRow[i]);
        }
        return valRow[valRow.length - 1];
    }


    public static void main(String[] args) {
        int[] temp = {10, 15, 20, 1, 23, 14};
        System.out.println(min(temp));
    }
}
