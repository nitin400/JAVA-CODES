import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }

        // Count the frequency of each number in the array
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int num : nums) {
            numFrequencyMap.put(num, numFrequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Iterate through the keys in the map
        for (int num : numFrequencyMap.keySet()) {
            if (k == 0) {
                // If k is 0, check if the number appears more than once in the array
                if (numFrequencyMap.get(num) > 1) {
                    count++;
                }
            } else {
                // Check if there exists a pair (num, num + k) in the array
                if (numFrequencyMap.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
