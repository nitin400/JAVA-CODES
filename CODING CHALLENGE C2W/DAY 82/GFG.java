class MyQueue {
 
    int front, rear;
int arr[] = new int[100005];
int count;
 
    MyQueue()
{
front=0;
rear=0;
count=0;
}
 
//Function to push an element x in a queue.
void push(int x)
{
        if(count<arr.length){
        arr[(rear++)%arr.length]=x;
        count++;
        }
    else{
        System.out.println("No space");
    }
} 
 
    //Function to pop an element from queue and return that element.
int pop()
{
    if(front==rear){
        return -1;
    }
int ans=arr[front++];
count--;
return ans;
 
} 
}
