public class count_factor {
    public static void main(String[] args) {
        int n=10;

        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                count++;
            }
        }

        System.out.println(count);
    }
    
}
