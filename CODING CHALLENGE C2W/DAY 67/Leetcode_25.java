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
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode rev=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1;i<k;i++){
            if(temp==null)return head;
            else temp=temp.next;
        }
        ListNode n=null;
        if(temp!=null)
       { n=reverseKGroup(temp.next,k);
        temp.next=null;
        head=reverse(head);
        temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.next=n;}
        return head;
        
    }
}