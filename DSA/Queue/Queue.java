import java.util.Scanner;

class Queue {

    int queueArr[];
    int front;
    int rear;
    int maxSize;

    Queue(int size){
        this.queueArr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.maxSize=size;
    }
    
}

class Client{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array size");
        int size= sc.nextInt();

        Queue q=new Queue(size);
        char ch;

        do{
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: empty");
            System.out.println("4: front");
            System.out.println("5: rear");
            System.out.println("6: printQueue");

            System.out.println("Enter your choice");
            int choice= sc.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.println("Enter data to enqueu");
                        int data=sc.nextInt();
                        q.enqueue(data);
                    }
                    break;

                case 2:
                    {
                        int ret= q.dequeue();
                        if(ret !=-1){
                            System.out.println(ret+"pop");
                        }
                    }
                    break;

                case 3:
                    {
                        boolean ret= q.empty();

                        if(ret)
                            System.out.println("queue is an empty");

                        else{
                            System.out.println("Queue is not an empty");
                        }
                    }
                    break;

                    case 4:
                        {
                            int ret=q.front();

                            if(ret !=-1){
                                System.out.println("Front element is "+ ret);
                            }
                            else{
                                
                            }
                        }
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
