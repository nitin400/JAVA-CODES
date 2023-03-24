class Pattern {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=3;i++){
            char c='C';
            int k2=3;
            for(int j=1;j<=3;j++){
                System.out.print(k*k);
                System.out.print(c--);
                System.out.print( k2-- +" ");
                k++;
            }
            System.out.println();
        }
    }
    
}
