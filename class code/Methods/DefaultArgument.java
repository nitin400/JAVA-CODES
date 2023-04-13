
import java.io.IOException;
import java.util.Scanner;

public class DefaultArgument {


void f1(int a,int b,int c=0){
    int x=a;
    int y=b;
    int z=c;
    int ans=x+y+z;
    System.out.println(ans);
}

public static void main(String[] args)throws IOException {
    
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int b=sc.nextInt();


DefaultArgument d=new DefaultArgument();
d.f1(10,20,30);


}
    
}
