class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> st=new Stack<>();
        int l=S.length();
        for (int i=0;i<l;i++)
        {
            char ch=S.charAt(i);
            st.push(ch);}
      StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.toString();
    }

}