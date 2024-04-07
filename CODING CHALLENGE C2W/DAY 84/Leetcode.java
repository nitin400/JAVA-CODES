class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list =new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int count=0;
        while(list.size()>1){
            for(int i=0;i<list.size();i++){
                count++;
                if(list.size()==1) return list.get(0);
                if(count==k) {
                    System.out.println(list.get(i)+" ");
                    list.remove(i);
                    i--;
                    count=0;
                }
            }
        }
        return list.get(0);
    }
}