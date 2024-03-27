class Solution
{
    public void deleteMid(Stack<Integer>s,int size){
        int mid =  size/2;
        Stack<Integer>st = new Stack<>();
        for(int i = 1; i <= mid+1; i++){
            st.push(s.pop());
        }
        st.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
       
    } 
}