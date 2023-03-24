class Pattern {
    public static void main(String args[]){
        int x=3;
        int y=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if((j==(4-i) || (i==3 && j==3))){
                    System.out.print(x*x+" ");
                    y++;
                    x=x+2;
                }
                else{
                    System.out.print(y+" ");
                    y++;
                }
                
            }
            System.out.println();
        }
    }
    
}
