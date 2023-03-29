class Pattern7 {
    public static void main(String args[]){
        char c='F';
        char temp='F';
        int n=6;

        for(int i=1;i<=n;i++){
            temp=c--;
            for(int j=1;j<=i;j++){
                System.out.print(temp++ +" ");
            }
            System.out.println();
        }
    }
    
}
