
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int nSquare = grid.length * grid.length;
        int sum = nSquare * (nSquare + 1) / 2;
        boolean[] found = new boolean[nSquare + 1];
        int repeated = 1;
        for (int[] row : grid) {
            for (int n : row) {
                sum -= n;
                if (found[n]) repeated = n;
                found[n] = true;
            }
        }

        return new int[]{repeated, sum + repeated};
    }
}