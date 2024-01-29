public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        // Traverse through all array elements.
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, so we don't need to check them.
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
