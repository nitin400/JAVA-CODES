/*5] Replace all 0's with 5

You are given an integer N. You need to convert all zeros of N to 5.
Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)
Constraints:
1 <= n <= 10000
*/

class Replace {
    public static int reverse(int n) {
        int temp = 0;
        while (n != 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        return temp;
    }

    public static int replace(int n) {
        int temp = 0;
        while (n != 0) {
            int k = n % 10;
            if (k == 0)
                k = 5;

            temp = temp * 10 + k;
            n = n / 10;

        }

        return reverse(temp);
    }

    public static void main(String[] args) {
        int n = 100;

        System.out.println(replace(n));

    }
}