class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();  // Initialize an empty result list
        int current = 1;  // Initialize the current number to 1

        for (int num : target) {
            while (current < num) {
                // Push elements from 1 to num - 1 into the result list
                result.add("Push");
                result.add("Pop");
                current++;
            }

            // Push the current number into the result list
            // Current number should be a target number right now
            result.add("Push");
            current++;
        }

        return result;        
    }
}