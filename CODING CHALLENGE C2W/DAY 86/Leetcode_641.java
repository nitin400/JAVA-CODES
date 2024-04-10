class MyCircularDeque {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public MyCircularDeque(int k) {
        queue = new int[k];
        front = 0; rear = 0; 
        capacity = k; size = 0;
    }
    
    public boolean insertFront(int value) {
        if(this.isFull())
            return false;
        front = (capacity + front - 1) % capacity;
        queue[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(this.isFull())
            return false;
        queue[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(this.isEmpty())
            return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(this.isEmpty())
            return false;
        rear = (capacity + rear - 1) % capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        if(this.isEmpty())
            return -1;
        return queue[front];
    }
    
    public int getRear() {
        if(this.isEmpty())
            return -1;
        return queue[(capacity + rear - 1) % capacity];
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */