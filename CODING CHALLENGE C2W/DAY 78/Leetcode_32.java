class Solution {
    public int longestValidParentheses(String S) {
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
            {
                left++;
            }
            else
            {
                right++;
            }
            if(left==right)
            {
                max=Math.max(max,left*2);
            }
            else if(right>left)
            {
                left=0;
                right=0;
            }
        }
        left=0;
        right=0;
        for(int i=S.length()-1;i>=0;i--)
        {
             if(S.charAt(i)=='(')
             {
                left++;
            }
            else
            {
                right++;
            }
            if(left==right)
            {
                max=Math.max(max,left*2);
            }
            else if(left>right)
            {
                left=0;
                right=0;
            }
        }
        return max;
    }
}