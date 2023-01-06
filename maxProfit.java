public class maxProfit {
    public static int solution(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int[] buy = new int[2];
        buy[0] = prices[0];
        int[] sell = new int[2];

        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > sell[0]) {
                sell[0] = prices[i];
                sell[1] = i;
            }
            if (prices[i] < buy[0]) {
                buy[0] = prices[i];
                buy[1] = i;
                sell[0] = prices[i];
                sell[1] = i;
            }
            if (sell[0] - buy[0] > max) {
                max = sell[0] - buy[0];
            }

        }

        return max;

    }

    public static void main(String[] args) {
        int[] p1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution(p1));
    }
}
