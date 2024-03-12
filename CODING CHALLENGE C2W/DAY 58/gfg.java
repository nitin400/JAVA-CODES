class Solution
{
    // Function to sort a linked list of 0s, 1s, and 2s.
    static Node segregate(Node head)
    {
        if (head == null || head.next == null)
            return head;

        // Initialize pointers for 0, 1, and 2
        Node zeroHead = new Node(0);
        Node oneHead = new Node(0);
        Node twoHead = new Node(0);

        Node zeroTail = zeroHead, oneTail = oneHead, twoTail = twoHead;

        Node current = head;

        while (current != null) {
            if (current.data == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            } else if (current.data == 1) {
                oneTail.next = current;
                oneTail = oneTail.next;
            } else {
                twoTail.next = current;
                twoTail = twoTail.next;
            }

            current = current.next;
        }

        // Connect the three segments
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;

        // Return the new head
        return zeroHead.next;
    }
}
