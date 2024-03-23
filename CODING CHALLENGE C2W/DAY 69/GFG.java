class MyStack
{
    int top;
int arr[] = new int[1000];
 
    MyStack()
{
top = -1;
}
 
    void push(int a)
{
    arr[++top] = a;
} 
 
int pop()
{
        // Your code here
        if(top==-1) return -1;
        return arr[top--];
}
}
