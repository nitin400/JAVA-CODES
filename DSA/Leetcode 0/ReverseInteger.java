/*1. Reverse Integer (Leetcode:- 7)

Given a signed 32-bit integer x, return x with its digits reversed. If reversing
x causes the value to go outside the signed 32-bit integer range [-231, 231
- 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed
or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21

Constraints:
-231 <= x <= 231 - 1 */

public class ReverseInteger {
    public static int ReverseInteger(int num) {
        // int temp=num;
        // if (num < 0) {

        // temp=-temp;

        // }

        int n = num;
        int rev = 0;
        if ( num>=((int) (Math.pow(-2, 31)))  && num <= ((int) (Math.pow(2, 31) -1))) {

              while (n != 0) {

                rev = 10 * rev + n % 10;
                n = n / 10;
            }
            return rev;
            
        }
    
        

        // return num < 0 ? -rev : rev;
            return 0;
    }

    public static void main(String[] args) {
        int x = 2147483647;
         System.out.println(2147483647/10);
        //System.out.println(ReverseInteger(x));
    }
}