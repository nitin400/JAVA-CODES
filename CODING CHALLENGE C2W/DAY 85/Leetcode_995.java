class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt=0,j=0;
        boolean compared[]=new boolean[strs.length];
        for(int i=0;i<strs[0].length();i++){
            boolean currCompared[]=new boolean[strs.length];
            for(j=0;j<strs.length-1;j++){
                if(!compared[j]){ 
                    if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                        cnt++;
                        break;
                    }
                    else if(strs[j].charAt(i)<strs[j+1].charAt(i))
                        currCompared[j]=true;
                }
            }
            if(j==strs.length-1)
                for(;j>0;j--) compared[j-1]|=currCompared[j-1];
        }
        return cnt;
    }
}