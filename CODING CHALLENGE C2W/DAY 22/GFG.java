

class Solution
{
    // Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // Process the first window separately
        for (int i = 0; i < k; i++) {
            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        // Process the remaining windows
        for (int i = k; i < n; i++) {
            // The front of the deque contains the maximum element in the current window
            result.add(arr[deque.peekFirst()]);

            // Remove elements that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(i);
        }

        // Add the maximum of the last window to the result
        result.add(arr[deque.peekFirst()]);

        return result;
    }
}