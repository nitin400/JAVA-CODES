class Pattern {
    public static void main(String args[]){
        char c='A';
        char k='b';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j%2!=0){
                    System.out.print(c+" ");
                    c++;
                    c++;
                }
                else{
                    System.out.print(k+" ");
                    k++;
                    k++;
                }
            }
            System.out.println();
        }
    }
    
}
