class Solution {
    public int maxArea(int[] height) {
        //using 2 pointer approach..... 

        int maxWater=0;
        int lp=0;        //left pointer pointing to 0 index of array
        int rp=height.length-1; // pointing to the last box of the array..

        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);

            // update ptr whose value is less because small is changing water level instead of large ..
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
}