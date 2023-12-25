// implementing circular queue

import java.util.Scanner;

class CircularQueue {

    int queueArr[];
    int front;
    int rear;
    int maxSize;

    CircularQueue(int size) {
        this.queueArr = new int[size];
        this.front = -1;
        this.rear = -1;
        this.maxSize = size;

    }

    void enqueue(int data) {

        if ((front == 0 && rear == maxSize - 1) && ((rear + 1) % maxSize == front)) {
            System.out.println("Full...");
            return;
        } else if (front == -1) {
            front = rear = 0;

        } else if (rear == maxSize - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        queueArr[rear] = data;

    }

    int dequeue() {
        int ret = -1;
        if (front == -1) {
            System.out.println("queue is empty");

        } else {
            ret = queueArr[front];
            if (front == rear) {
                rear = front = -1;
            } else if (front == maxSize - 1) {
                front = 0;
            } else {
                front++;
            }

        }
        return ret;

    }

    void printQueue() {

        if (front <= rear) {
            for (int i = front; i <= maxSize; i++) {
                System.out.println(queueArr[i] + " ");
            }
        } else {

            for (int i = front; i < maxSize; i++) {
                System.out.println(queueArr[i] + " ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.println(queueArr[i] + " ");
            }
        }

    }
}

class Client {
    public static void main(String[] args) {

        System.out.println("Enter the size of an arraty");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        CircularQueue cq = new CircularQueue(size);

        char ch;

        do {
            System.out.println("1.Enqueu");
            System.out.println("2.Deque");
            System.out.println("3.print");

            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter data for Enquee");
                    int data = sc.nextInt();
                    cq.enqueue(data);
                }
                    break;
                case 2: {
                    int ret = cq.dequeue();

                    if (ret != -1) {
                        System.out.println(ret + "popped");
                    }
                }
                    break;
                case 3: {
                    cq.printQueue();

                }
                    break;

                default:
                    System.out.println("wrong choice");
            }

            System.out.println("do you want to continue?");

            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }

}