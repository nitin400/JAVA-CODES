
class Solution {
    // Function to detect and remove loop in a linked list
    public static void removeLoop(Node head) {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        // Detecting the loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }

        // If loop exists, find the start of the loop
        if (slow == fast) {
            // Check if the loop starts from the head
            if (slow == head) {
                while (fast.next != head) {
                    fast = fast.next;
                }
                fast.next = null;
            } else {
                slow = head;
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                // Break the loop
                fast.next = null;
            }
        }
    }
}