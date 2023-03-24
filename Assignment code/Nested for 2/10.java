class Pattern {
    public static void main(String[] args) {
        
        for(int i=1;i<=6;i++){
            int k1=5;
            char c='F';
            for(int j=1;j<=6;j++){
                if(j%2!=0){
                    System.out.print(c+" ");
                    c--;
                    c--;
                }
                else{
                    System.out.print(k1+" ");
                    k1=k1-2;
                }

            }
            System.out.println();
        }
    }
    
}
