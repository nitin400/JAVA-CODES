import java.util.Arrays;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskCount = new int[26];

        // Count the frequency of each task
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }

        // Sort the taskCount array in descending order
        Arrays.sort(taskCount);
        int maxCount = taskCount[25];

        // Count the number of tasks with the maximum frequency
        int maxTasksCount = (maxCount - 1) * n;

        // Iterate over the taskCount array and add tasks with lower frequency
        for (int i = 24; i >= 0 && taskCount[i] > 0; i--) {
            maxTasksCount -= Math.min(taskCount[i], maxCount - 1);
        }

        // Calculate the total number of slots required
        int totalSlots = tasks.length + Math.max(0, maxTasksCount);

        // Return the maximum of the totalSlots and the length of tasks array
        return Math.max(totalSlots, tasks.length);
    }
}
