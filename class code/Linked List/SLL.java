class Node {

    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    int Count;
    Node head = null;

    // 1 . addFirst
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;

        else {
            newNode.next = head;
            head = newNode;
        }
        Count++;
    }

    // 2. printSLL

    void printSLL() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // 3. addLast

    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        Count++;
    }

    // 4. addAtPos()

    void addAtPos(int pos, int data) {
        Node newNode = new Node(data);
        if (pos <= 1 || pos > Count + 1) {
            System.out.println("invalid position");
            return;
        } else if (pos == 1) {
            addFirst(data);
        } else if (pos == Count + 1) {
            addLast(data);
        } else {
            Node temp = head;
            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }

    }

    // delete First

    void delFirst() {

        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (Count == 1) {
            head = null;
        } else {

            head = head.next;

        }
    }

    // delete First

    void delLast() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (Count == 1) {
            head = null;
        } else {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;

        }
    }

    void delAtPos(int pos) {
        Node temp = head;

        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (Count == 1) {
            head = null;
        } else {

            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }
            temp.next = temp.next.next;
        }

    }

}

public class SLL {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.printSLL();
        ll.addFirst(20);
        ll.addFirst(30);
        ll.printSLL();
        ll.addLast(40);
        ll.printSLL();
        System.out.println(ll.Count);

        ll.addAtPos(2, 100);
        ll.printSLL();

        ll.delFirst();
        ll.printSLL();
        ll.addAtPos(3, 00);
        ll.printSLL();

    }
}