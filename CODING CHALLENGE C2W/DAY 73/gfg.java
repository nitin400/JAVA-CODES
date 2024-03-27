StackNode top;

 void push(int a) 
    {
        // Add your code here
        StackNode temp=new StackNode(a);
          temp.next=top;
          top=temp;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(top==null) return -1;
        int val=top.data;
         top=top.next;
         return val;
    }
