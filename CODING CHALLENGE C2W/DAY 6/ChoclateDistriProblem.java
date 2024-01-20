
/*
 * 
 * Code3 : Chocolate Distribution problem
Company : Flipkart
Platform : GFG
Love Bubbars’s SDE sheet
Description :
Given an array A[ ] of positive integers of size N, where each value represents
the number of chocolates in a packet. Each packet can have a variable number of
chocolates. There are M students, the task is to distribute chocolate packets among M
students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and
minimum number of chocolates given to a student is minimum.
Example 1:
Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between maximum chocolates and
minimum chocolates is 9 - 3 = 6 by choosing the following M packets :{3, 4, 9, 7,
9}.
Example 2:
Input:
N = 7, M = 3
A = {7, 3, 2, 4, 9, 12, 56}
Output: 2
Explanation: The minimum difference between maximum chocolates and
minimum chocolates is 4 - 2 = 2 by choosing the following M packets :{3, 2, 4}.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
1 ≤ Ai ≤ 109
1 ≤ M ≤ N
 */

import java.util.ArrayList;
import java.util.Collections;

public class ChoclateDistriProblem {
        public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        // Sort the array
        Collections.sort(a);

        long minDiff = Long.MAX_VALUE;

        // Iterate through the array to find the minimum difference
        for (int i = 0; i + m - 1 < n; i++) {
            long currentDiff = a.get(i + m - 1) - a.get(i);
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }
}
