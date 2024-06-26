class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the intersection point in the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}