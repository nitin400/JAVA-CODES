import java.util.* ;
import java.io.*; 
import java.util.ArrayList;



import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static int subArrayCount(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int count = 0;
        int currSum = 0;
        HashMap<Integer, Integer> remainderCount = new HashMap<>();

        // Initialize count of remainder 0 to 1 (for empty subarrays)
        remainderCount.put(0, 1);

        for (int i = 0; i < n; i++) {
            currSum = (currSum + arr.get(i)) % k;
            // Handle negative remainders correctly
            currSum = (currSum + k) % k; 

            count += remainderCount.getOrDefault(currSum, 0);
            remainderCount.put(currSum, remainderCount.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    // ... (main function remains same)
}
