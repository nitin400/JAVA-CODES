class Solution
{
    Node compute(Node head)
    {
        if (head == null || head.next == null) {
            return head; // No need to process if the list is empty or has only one node
        }

        Node current = reverseList(head); // Reverse the linked list
        Node maxNode = current; // Initialize the maximum node to the first node

        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                current.next = current.next.next; // Remove the current node
            } else {
                maxNode = current.next; // Update the maximum node
                current = current.next; // Move to the next node
            }
        }

        return reverseList(maxNode); // Reverse the modified list and return the head
    }

    // Helper function to reverse a linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev; // Return the new head of the reversed list
    }
}
