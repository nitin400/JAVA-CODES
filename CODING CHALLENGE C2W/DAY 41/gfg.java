public class Solution {
    public static int maxProfit(int n, int[] price) {
        if (n <= 1) {
            return 0;
        }

        int[] profit1 = new int[n];
        int[] profit2 = new int[n];

        // Calculate the maximum profit with at most one transaction
        int minPrice = price[0];
        for (int i = 1; i < n; i++) {
            profit1[i] = Math.max(profit1[i - 1], price[i] - minPrice);
            minPrice = Math.min(minPrice, price[i]);
        }

        // Calculate the maximum profit with at most two transactions
        for (int k = 2; k <= 2; k++) {
            int maxDiff = -price[0];
            for (int i = 1; i < n; i++) {
                profit2[i] = Math.max(profit2[i - 1], price[i] + maxDiff);
                maxDiff = Math.max(maxDiff, profit1[i] - price[i]);
            }
        }

        return profit2[n - 1];
    }
}
 gfg {
    
}
