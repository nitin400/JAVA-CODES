
class Solution {
    public int getMinDiff(int[] arr, int n, int k) {
  if(n==1) return 0;
        
        Arrays.sort(arr);
        
        // find the difference between the smallest and the largest element of the array
        int diff = arr[n-1] - arr[0];
        
        int min,max;
        
        
          // LOgic for finding Minimum difference..
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        
        for(int i = 1; i < n; i++){ 
            
            if(arr[i] - k < 0) continue;
            
            max = Math.max(largest,  arr[i-1]+k);
            min = Math.min(smallest, arr[i] - k  );
            
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}