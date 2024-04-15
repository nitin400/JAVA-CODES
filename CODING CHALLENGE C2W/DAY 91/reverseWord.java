
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
      StringBuffer sb=new StringBuffer();
      String str[]=S.split("\\.");
      for(int i=str.length-1;i>=0;i--)
      {
          if(i>0)
          {
              sb.append(str[i]+".");
          }
          else
          {
              sb.append(str[i]);
          }
      }
      return sb.toString();
    }
}