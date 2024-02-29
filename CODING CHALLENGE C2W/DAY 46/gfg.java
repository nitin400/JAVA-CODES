public int findMaxSum(int[] arr, int n) {
    if (n == 0)
        return 0;
    if (n == 1)
        return arr[0];

    // Initialize an array to store the maximum loot at each house.
    int[] dp = new int[n];

    // Base cases
    dp[0] = arr[0];
    dp[1] = Math.max(arr[0], arr[1]);

    // Fill the dp array using the recurrence relation.
    for (int i = 2; i < n; i++) {
        dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
    }

    // The last element of dp array contains the maximum loot.
    return dp[n - 1];
}
