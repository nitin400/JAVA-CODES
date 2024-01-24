/*
 * Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i]
 * 
 */

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) {
        long[] leftProducts = new long[n];
        long[] rightProducts = new long[n];
        long[] result = new long[n];

        // Calculate leftProducts
        long leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate rightProducts
        long rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }

        // Calculate the product array P
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
}
