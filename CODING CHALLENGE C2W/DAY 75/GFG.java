class GfG{
    public static void sorting(Stack<Integer> st){
        if(st.isEmpty()) return;
        
        int x=st.pop();
        
        sorting(st);
        
        Stack<Integer> ref=new Stack<Integer>();
        
        while(!st.isEmpty() && st.peek()>x){
            ref.push(st.pop());
        }
        
        ref.push(x);
        
        while(!ref.isEmpty()){
            st.push(ref.pop());
        }
        
    }
    public Stack<Integer> sort(Stack<Integer> s)
    {
        sorting(s);
        
        return s;
    }
}