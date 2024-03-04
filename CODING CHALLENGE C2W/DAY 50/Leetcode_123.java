class Solution {
    public int maxProfit(int[] P) {
        int min = P[0], n = P.length;
        int[] dp = new int[n];
        //l->r
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i - 1], P[i] - min);
            if(min > P[i]) min = P[i];
        }
        int result = dp[n - 1];
        int max = P[n - 1], prev = 0;
        //r->l
        for(int i = n - 2; i > -1; i--){
            prev = Math.max(prev, max - P[i]);
            result = Math.max(result, prev + dp[i]);
            if(max < P[i]) max=  P[i];
        }
        return result;
    }
    }