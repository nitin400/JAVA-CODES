class Solution {
    public int firstMissingPositive(int[] nums) {
         int n = nums.length;
     int i = 0;
    while(i < n){ 
        int sahi = nums[i]-1;
        if (nums[i] > 0 && nums[i] < n && nums[i] != nums[sahi]) {
                swap(nums, i, sahi);
        }else{
            i++;
        }
    } 
    for(int idx = 0; idx < n; idx++){
        if(nums[idx] != idx + 1){
            return idx+1;
            
        }
    }
    return n + 1;

    

    }
   public void swap(int[] nums, int start, int end){
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    }
}