import java.io.*;

class Pattern1{
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of rows");

        int row=Integer.parseInt(br.readLine());

        System.out.println("Enter number of coloumns");

        int col=Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            char c1='A',c2=(char)(col+64);
            int k1=1,k2=col;

            for(int j=1;j<=col;j++){
                if(i%2==0){
                    System.out.print(c1++ +""+ +k1++ +" ");
                }
                else{
                    System.out.print(c2-- +""+ +k2-- +" ");
                }
            }
            System.out.println();
        }

    }
}