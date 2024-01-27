
/*
 * Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.
 * 
 */
public class MaxMin {
    public static long find_multiplication(int arr[], int brr[], int n, int m) {
        // Find the maximum element in the first array (A)
        int maxA = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxA) {
                maxA = arr[i];
            }
        }

        // Find the minimum element in the second array (B)
        int minB = brr[0];
        for (int i = 1; i < m; i++) {
            if (brr[i] < minB) {
                minB = brr[i];
            }
        }

        // Calculate the product of the maximum element in A and minimum element in B
        long product = (long) maxA * minB;

        return product;
    }
}
