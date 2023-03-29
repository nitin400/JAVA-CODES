class Pattern4 {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print("3C"+" ");
            }
            System.out.println();
        }
    }
    
}
