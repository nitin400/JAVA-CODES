
class Solution {
    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second) {
        // Reverse both input linked lists
        first = reverseList(first);
        second = reverseList(second);
        
        Node dummyHead = new Node(0); // Dummy head to ease handling edge cases
        Node current = dummyHead;
        int carry = 0;

        while (first != null || second != null || carry != 0) {
            int sum = carry;
            if (first != null) {
                sum += first.data;
                first = first.next;
            }
            if (second != null) {
                sum += second.data;
                second = second.next;
            }
            carry = sum / 10; // Calculate carry
            sum %= 10; // Calculate sum without carry

            current.next = new Node(sum); // Create new node with sum digit
            current = current.next;
        }

        // Reverse the resultant sum list
        return reverseList(dummyHead.next);
    }
    
    // Function to reverse a linked list
    static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev; // Return new head
    }
}
