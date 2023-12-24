import java.util.Scanner;

class Node{
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head=null;

    // add Node

    void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;

            while(temp.next !=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }

    // print

    void printLL(){
        if(head==null){
            System.out.println("Empty Linked List");
            return;

        }
        else{
            Node temp=head;

            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

class Client{
       

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();

        char ch;
        do{
            System.out.println("1.add Node");
            System.out.println("2. print LL");
            System.out.println("3. Reverse Itr");
            System.out.println("Reverse rec");

            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                {
                    System.out.println("Enter Data");
                    int data=sc.nextInt();
                    ll.addNode(data);
                }
                break;

                case 2:
                {
                    ll.printLL();
                    break;
                }

                case 3:
                {
                    
                    break;
                }

                default:
                System.out.println("Wrong Choice");
                break;
            }
        }
    }
}