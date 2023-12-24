/*
 * reverse a string using a stack
 * Approach:-
 */

import java.util.Stack;

public class ReverseAStringUsingStack{

    public static void main(String[] args) {
        Stack<Character>st=new Stack<>();
        
        String str="Nitin";
        String rev="";
        int len=str.length();
        char arr[]=new char[len];

        for(int i=0;i<str.length();i++){

            st.push(str.charAt(i));



        }
        for(int i=0; i<len;i++){
            char ele=st.pop();
            arr[i]=ele;
          
        }
        System.out.println(arr);
    }

 }