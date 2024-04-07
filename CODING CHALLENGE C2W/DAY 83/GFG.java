class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
       ArrayDeque<Integer> s=new ArrayDeque<>();
       
       while(!q.isEmpty()){
           s.push(q.poll());
       }
       
       while(!s.isEmpty()){
           q.offer(s.pop());
       }
        
        
        return q;
    }
}
