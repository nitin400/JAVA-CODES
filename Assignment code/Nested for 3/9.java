class Pattern9 {
    public static void main(String args[]){
        int k=1;
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k*k*k +" ");
                k++;
            }
            System.out.println();
        }
    }
    
}
