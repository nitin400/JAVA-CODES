class GfG
{
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        // Base case: if the list is empty or has only one node.
        if (head == null || head.next == null) {
            return head;
        }

        // Pointer to traverse the linked list.
        Node current = head;

        // Iterate through the list.
        while (current.next != null) {
            // Compare current node's value with the next node's value.
            if (current.data == current.next.data) {
                // If they are equal, skip the next node.
                current.next = current.next.next;
            } else {
                // Move to the next node.
                current = current.next;
            }
        }

        return head;
    }
}
