import java.util.Scanner;

public class palindrome {
    static int isPalindrome(int n){
        int temp=n;
        int num=0;
        while(n!=0){
            int rem=n%10;
            int num=num*10+rem;
            n=n/10;

        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
    }
    
}
