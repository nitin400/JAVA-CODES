class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long cost=0;
        while(pq.size()>1){
            long min=pq.remove();
            long min2=pq.remove();
            cost+=min+min2;
            pq.add(min+min2);
        }
        return cost;
    }
}
