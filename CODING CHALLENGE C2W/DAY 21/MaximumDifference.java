class Solution
{
    int findMaxDiff(int a[], int n)
    {
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Finding the nearest smaller element on the left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            leftSmaller[i] = stack.isEmpty() ? 0 : a[stack.peek()];
            stack.push(i);
        }

        stack.clear();

        // Finding the nearest smaller element on the right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            rightSmaller[i] = stack.isEmpty() ? 0 : a[stack.peek()];
            stack.push(i);
        }

        // Finding the maximum absolute difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(leftSmaller[i] - rightSmaller[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}