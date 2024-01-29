public class TransposeOfMatrix {
    public void transpose(int n, int a[][])
    {
        // Traverse each element in the upper triangle of the matrix.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with element at (j, i).
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
