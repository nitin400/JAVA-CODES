import java.util.Scanner;

public class perfectNumber {

    static int isPerfectNumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){

            if(n%i==0){
                sum=sum+i;
            }
            
        }
        if(sum==temp){
            return sum;
        }
        return 0;
        



    }

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        if(isPerfectNumber(n)==temp){
            System.out.println("PERFECT NUMBER");
        }
        else{
            System.out.println("Not perfect Number");
        }

    }
    
}
