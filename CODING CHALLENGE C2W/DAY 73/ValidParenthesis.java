class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss=new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        // push into the stack
        for(int i=0;i<s.length();i++){
            if( (s.charAt(i)=='(' ) || (s.charAt(i)=='{') ||  (s.charAt(i)=='[')  )
            ss.push(s.charAt(i));

            

            else{
                if(ss.isEmpty())return false;
                if((s.charAt(i)==')' && ss.peek()=='(')  || (s.charAt(i)=='}' && ss.peek()=='{') ||  (s.charAt(i)==']' && ss.peek()=='[')){
                    ss.pop();
                }else return false;

            }
                

            


        }
            if(ss.isEmpty())return true;
            else return false;

        

    }
}