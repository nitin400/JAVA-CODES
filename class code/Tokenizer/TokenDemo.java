import java.util.Scanner;
import java.util.StringTokenizer;

class TokenDemo{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter info");
        String str=sc.nextLine();

        StringTokenizer st=new StringTokenizer(str," ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}