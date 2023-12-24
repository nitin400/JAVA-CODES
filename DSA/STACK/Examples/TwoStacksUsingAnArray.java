import java.util.Scanner;

public class TwoStacksUsingAnArray {

    int stackArr[];
    int top1;
    int top2;
    int maxSize;

    TwoStacksUsingAnArray(int size) {
        this.stackArr = new int[size];
        this.top1 = -1;
        this.top2 = size;
        this.maxSize = size;
    }

    void push1(int data) {

        if (top2 - top1 > 1) {
            top1++;
            stackArr[top1] = data;
        } else {
            System.out.println("stack overflow");
        }
    }

    void push2(int data) {

        if (top2 - top1 > 1) {
            top2--;
            stackArr[top2] = data;
        } else {
            System.out.println("stack overflow");
        }
    }

    int pop1(){

        if(top1==-1){
            System.out.println("stack1 is empty");
            return -1;
        }else{
            int val= stackArr[top1--];
            return val;
        }
    }

        int pop2(){

        if(top2==maxSize){
            System.out.println("stack2 is empty");
            return -1;
        }else{
            int val= stackArr[top2++];
            return val;
        }
    }

}

class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = sc.nextInt();

        TwoStacksUsingAnArray obj = new TwoStacksUsingAnArray(size);
        char ch;
        do {
            System.out.println("1.push1");
            System.out.println("2.push2");
            System.out.println("3.pop1");
            System.out.println("4.pop2");
            // System.out.println("5.push1");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter element for stack1");
                    int data = sc.nextInt();
                    obj.push1(data);
                }
                    break;

                case 2: {
                    System.out.println("Enter element for stack2");
                    int data = sc.nextInt();
                    obj.push2(data);
                }
                    break;

                case 3: {
                    int ret = obj.pop1();

                    if (ret != -1) {
                        System.out.println(ret + "popped from stack1");

                    }
                }
                    break;

                case 4: {
                    int ret = obj.pop2();

                    if (ret != -1) {
                        System.out.println(ret + "popped from stack2");

                    }
                }
                    break;

                default:
                    System.out.println("wrong choice");
                    break;
            }

            System.out.println("do you want to continue");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
    }
}
