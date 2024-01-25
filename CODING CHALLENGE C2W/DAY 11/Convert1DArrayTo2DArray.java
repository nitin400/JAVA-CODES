/*
 * You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.

The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.

Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible
 */

public class Convert1DArrayTo2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int totalElements = m * n;
        
        // Check if the total number of elements in original is equal to m * n
        if (original.length != totalElements) {
            return new int[0][0]; // Return an empty 2D array
        }
        
        int[][] result = new int[m][n];
        
        for (int i = 0; i < totalElements; i++) {
            result[i / n][i % n] = original[i];
        }
        
        return result;
    }
}
