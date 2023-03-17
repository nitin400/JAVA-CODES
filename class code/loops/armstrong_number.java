class Armstrong{
    public static void main(String[] args) {
        int n=153;
        int t1=n;
        int t2=n;
        int count=0;
        int sum=0;


        while(t1 !=0){
            count++;
            n=n/10;

        }

        while(n !=0){
            int rem=n%10;

            int mul=1;
            
            for(int i=1; i<=count;i++){
                mul=mul*rem;
                
            }
            n=n/10;
            sum=sum+mul;
            

        }

        if(t2==sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
}