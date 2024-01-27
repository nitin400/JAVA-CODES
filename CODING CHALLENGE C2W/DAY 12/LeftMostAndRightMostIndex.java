/*
 * Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

Note: If the element is not present in the array return {-1,-1} as pair.
 */
public class LeftMostAndRightMostIndex {
    public pair indexes(long v[], long x) {
        int n = v.length;
        int first = -1, last = -1;

        // Find the first occurrence using binary search
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (v[mid] == x) {
                first = mid;
                high = mid - 1; // Search for the first occurrence in the left subarray
            } else if (v[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find the last occurrence using binary search (if first occurrence was found)
        if (first != -1) {
            low = first; high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (v[mid] == x) {
                    last = mid;
                    low = mid + 1; // Search for the last occurrence in the right subarray
                } else if (v[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return new pair(first, last);
    }
}
