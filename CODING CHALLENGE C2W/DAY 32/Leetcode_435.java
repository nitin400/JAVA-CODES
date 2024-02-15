class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // Sort by end time
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[1], arr2[1]));

        int lastEnd = intervals[0][1]; 
        int countNonOverlapping = 1; // Start with one non-overlapping interval

        for (int i = 1; i < intervals.length; i++) {
            // Non-overlapping condition
            if (intervals[i][0] >= lastEnd) {
                lastEnd = intervals[i][1];
                countNonOverlapping++;
            }
        }

        return intervals.length - countNonOverlapping;
    }
}

