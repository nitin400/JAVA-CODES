class Node {
    int data;
    Node next = null;
    Node prev = null;

    Node(int data) {
        this.data = data;

    }
}

class DLL {
    Node head = null;
    Node newNode = new Node(0);

    int countNode() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;

    }

    void addFirst(int data) {
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            temp.prev = head;
            head = newNode;
        }
    }

    void printSLL() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Client {

    public static void main(String[] args) {
        DLL ll = new DLL();

        int count = ll.countNode();
        System.out.println(count);

        ll.addFirst(10);
        ll.printSLL();

    }
}
