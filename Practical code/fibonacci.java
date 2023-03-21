class fibonacci{
    public static void main(String[] args) {
        int a=-1;
        int b=1;

        int n=50;

        while(n>0){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            n--;
        }
    }
}