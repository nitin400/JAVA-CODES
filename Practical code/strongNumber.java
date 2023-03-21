public class strongNumber {
    public static void main(String args[]){
        int n=145;
        int sum=0;
        int temp=n;
        


        while(n>0){
            int y=n%10;
            int fact=1;
            for(int i=1;i<=y;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Strong Number....");
        }
        else{
            System.out.println("Not strong number");
        }
    }
    
}
