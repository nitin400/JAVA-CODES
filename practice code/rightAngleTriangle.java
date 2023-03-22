import java.util.*;
class rightAngle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how much row you want");
        int row=sc.nextInt();
        System.out.println("Enter how much col you want");
        int col=sc.nextInt();

        for(int i=1;i<=row;i++ ){
            for(int j=1;j<=col;j++){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}