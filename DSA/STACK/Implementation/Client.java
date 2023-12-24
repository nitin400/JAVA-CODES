import java.util.Scanner;

 class StackImplementation {

    int maxSize;
    int StackArr[];
    int top=-1;

    StackImplementation(int size) {
        this.StackArr = new int[size];
        this.maxSize = size;
    }


    void push(int data){
        if(top<maxSize-1){
            System.out.println("stack Overflow");
            return;

        }else{
            top++;
            StackArr[top]=data;
        }

    }

}

 public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter stack size");
        int size=sc.nextInt();

        StackImplementation s=new StackImplementation(size);

        char ch;

        do{
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.empty");
            System.out.println("5.size");
            System.out.println("6.print");

            System.out.println("Enter your choicce");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:{
                    System.out.println("Enter Element for stack");
                    int data=sc.nextInt();
                    s.push(data);
                }
                break;

                default:
                    System.out.println("wrong choice");
                    break;
                    
                 

            }
            System.out.println("Do you want to continue");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');

    }
}
