class Pattern3 {
    public static void main(String args[]){
        int x=4;
        int y=10;
        int n=x*(x+1)/2;

        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(y-- +" ");
            }
            System.out.println();
        }
    }
    
}
