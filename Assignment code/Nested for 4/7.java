class Pattern {
    public static void main(String[] args) {
        int i1=1;
        char c='F';
        int n=6;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                if(j%2==0){
                    System.out.print(i1++ +" ");
                }
                else{
                    System.out.print(c-- +" ");

                }
            }
            System.out.println();
        }
    }
    
}
