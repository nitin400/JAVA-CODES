import java.util.Scanner;
import arithfun.Addition;

public class Client {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Addition obj=new Addition(x, y);
        System.out.println(obj.add());
    }
    
}
