class Pattern {
    public static void main(String args[]){
        int count=0;
        for(int i=1;i<=4;i++){
            count++;
            for(int j=1;j<=4;j++){
                
                
                System.out.print(i+" ");
                i++;
            }
            i=count;
            System.out.println();
        }
    }
    
}
