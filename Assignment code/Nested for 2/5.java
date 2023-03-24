class Pattern {
    public static void main(String args[]){
        int k=26;
        char c='Z';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j%2==0){
                    System.out.print(c-- +" ");
                }
                else{
                    System.out.print(k-- +" ");
                }
            }
            System.out.println();
        }
    }
    
}
