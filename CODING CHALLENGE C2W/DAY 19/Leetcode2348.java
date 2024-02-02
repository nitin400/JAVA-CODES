class Solution {
    public long zeroFilledSubarray(int[] nums) {
           long cnt = 0;
        long res = 0;
        long temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
            } else {
                // Corrected calculation of subarrays with zeros
                temp = (cnt * (cnt + 1)) / 2;
                res += temp;
                cnt = 0;  // Reset count for non-zero element
                temp=0;
            }
        }

        // Check if there are trailing zeros at the end of the array
        if (cnt > 0) {
            temp = (cnt * (cnt + 1)) / 2;
            res += temp;
        }

        return res;
    }
}
