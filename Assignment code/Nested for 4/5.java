class Pattern {
    public static void main(String[] args) {
        int n=4;
        char c='A';
        char d='A';
        for(int i=1;i<=n;i++){
            c=d;
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
            d++;
        }
    }
    
}
