class Pattern{
    public static void main(String args[]){
        int n=4;
        int k= (n*(n+1))/2;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("C2W"+k-- +" ");
            }
            System.out.println();
        }

    }
}