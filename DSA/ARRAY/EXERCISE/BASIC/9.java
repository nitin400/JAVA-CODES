/*9] Remove an Element at Specific Index from an Array
Given an array of a fixed length. The task is to remove an element at a specific
index from the array.
Examples 1:
Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }
Examples 2:
Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }
*/

class RemovingElement {

    public static int[] removeElement(int arr[], int index) {
        int n = index;
        int arr1[] = new int[arr.length];

        for (int i = 0, k = 0; i < arr.length; i++, k++) {

            if (i == index) {
                continue;
            }

            arr1[k] = arr[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int index = 2;

        removeElement(arr, index);

    }
}