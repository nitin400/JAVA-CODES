/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */

 public class PlusOne{
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;

            // Check if there's a carry
            if (digits[i] <= 9) {
                // If no carry, return the result
                return digits;
            }

            // If there's a carry, set the current digit to 0
            digits[i] = 0;
        }

        // If there's a carry after processing all digits, create a new array
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
 }