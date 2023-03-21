public class automorphic_number {
    public static void main(String[] args) {
        int n=25;
        int flag=0;
        int temp=n;
        int count=0;
        int sq=n*n;
        // while(temp!=0){
        //     count++;
        //     temp=temp/10;
        // }

        while(n>0){

            if(n%10 != sq%10){
                flag=1;
            }
            n=n/10;
            sq=sq/10;
            count--;
        }

        if(flag==0){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not automorphic number");
        }
    }
    
}
