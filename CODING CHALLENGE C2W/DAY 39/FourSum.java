class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Sort the input array
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        // Loop through the array for the first element
        for (int i = 0; i < n; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Loop through the array for the second element
            for (int j = i + 1; j < n; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Initialize two pointers for the remaining elements
                int start = j + 1;
                int end = n - 1;

                // Check all possible combinations
                while (start < end) {
                    // Calculate the sum of the four elements
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {
                        // If the sum is equal to the target, add the combination to the result
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        // Move pointers and skip duplicates
                        start++;
                        end--;

                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }

                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (sum < target) {
                        // If the sum is less than the target, increment the start pointer
                        start++;
                    } else {
                        // If the sum is greater than the target, decrement the end pointer
                        end--;
                    }
                }
            }
        }

        return result;
    }-
}