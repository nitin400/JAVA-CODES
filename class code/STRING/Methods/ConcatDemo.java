
/*
 * Method:- public string concat(String str);
 * Description:- Concatinate string to this string i.e. Another Sting is
 * concatinate first string implement new array of character whose length is sum
 * of str1.length and str2
 * parameter:- String
 * return type:- String
 */

 //code

 public class ConcatDemo{

    public static void main(String[] args) {
        
        String str1="Core2";
        String str2="Web";
        String str3=str1.concat(str2);
        System.out.println(str3);
    }
 }