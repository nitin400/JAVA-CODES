/*
 * Given an array arr of distinct elements of size N, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 
 * 
 */

public class ZigZag {
    public void zigZag(int a[], int n) {
        // Traverse the array and swap elements based on the zig-zag pattern
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0 && a[i] > a[i + 1]) {
                // If i is even and a[i] is greater than a[i+1], swap them
                swap(a, i, i + 1);
            } else if (i % 2 == 1 && a[i] < a[i + 1]) {
                // If i is odd and a[i] is less than a[i+1], swap them
                swap(a, i, i + 1);
            }
        }
    }

    // Helper method to swap elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

