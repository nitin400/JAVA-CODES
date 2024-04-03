class MyQueue {

    private Stack<Integer> writeStack = new Stack<>();
    private Stack<Integer> readStack = new Stack<>();

    public MyQueue() {}
    
    public void push(int x) {
        writeStack.push(x);
    }
    
    public int pop() {
        if(empty()) {
            return -1;
        }
        transfer();
        return readStack.pop();
    }
    
    public int peek() {
        if(empty()) {
            return -1;
        }
        transfer();
        return readStack.peek();
    }
    
    public boolean empty() {
        return readStack.isEmpty() && writeStack.isEmpty();
    }

    private void transfer() {
        if(readStack.isEmpty()) {
            while(!writeStack.isEmpty()) {
                readStack.push(writeStack.pop());
            }
        }    
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */