class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        double ans=0;
        int temp[]=new int[size];
        for(int i=0;i<size;i++){
            if(i<nums1.length){
                temp[i]=nums1[i];
            }else{
                temp[i]=nums2[i-nums1.length];
            }

        }

        Arrays.sort(temp);

        if(temp.length%2!=0){
            ans=temp[temp.length/2];
        }
        else{
            int index=temp.length/2;
            ans=(temp[index]+temp[--index])/2.0;
        }

        return ans;


        
    }
}