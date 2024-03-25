class twoStacks
{
    int arr[]= new int [100];
    int st1=-1;
    int st2=arr.length;
    twoStacks()
    {
        for(int i=0;i<100;i++){
            arr[i]=-1;
        }
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        arr[++st1]=x;
        //st1=st1+1;
        
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       arr[--st2]=x;
       //st2=st2-1;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(st1==-1){
            return -1;
        }
        int x=arr[st1];
        arr[st1]=-1;
         st1=st1-1;
        return x;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(st2==100){
            return -1;
        }
        int x=arr[st2];
        arr[st2]=-1;
         st2=st2+1;
        return x;
    }
}