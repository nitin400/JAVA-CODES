public class prime_number {
public static void main(String[] args) {
    int n=5;
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2)
    System.out.println("Prime Number");
    else
    System.out.println("Not Prime Number");
}
}

// jya number che factors exactly 2 astil to prime number asto 
