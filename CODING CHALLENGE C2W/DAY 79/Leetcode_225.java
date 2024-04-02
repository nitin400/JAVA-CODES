class MyStack {
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    int top;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        //top=0;
    }
    
    public void push(int x) {
        q1.offer(x);
        top=x;
    }
    
    public int pop() {
        while(q1.size()>1){
            top=q1.poll();
            q2.offer(top);
        }
        int val=q1.poll();
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return val;
    }
    
    public int top() {
       // if(!q1.isEmpty())
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */