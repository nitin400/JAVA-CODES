/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode rev = reverse(head);
        while(rev != null) {
            if(stack.isEmpty() || (!stack.isEmpty() && rev.val >= stack.peek())) {
                stack.push(rev.val);
            }
            rev = rev.next;
        }
        ListNode res = new ListNode();
        ListNode r = res;
        while(!stack.isEmpty()) {
            r.next = new ListNode(stack.pop());
            r = r.next;
        }
        return res.next;
    }

    ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}