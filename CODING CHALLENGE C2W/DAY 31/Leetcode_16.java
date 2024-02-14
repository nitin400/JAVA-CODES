class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort for efficient two-pointer traversal
        int closestSum = nums[0] + nums[1] + nums[2]; // Initial guess

        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == target) { 
                    return currentSum; // Perfect match
                }

                // Update closestSum if necessary 
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Adjust pointers based on currentSum's relationship to the target
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
