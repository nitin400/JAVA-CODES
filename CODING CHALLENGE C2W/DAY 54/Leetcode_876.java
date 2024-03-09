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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        // int size=0;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // temp=head;

        // if(size%2!=0){
        //     int k=size/2;
        //     for(int i=1;i<=k;i++){
        //         head=head.next;
        //     }
        //     return head;
        // }else{
        //     int k=size/2;
        //     for(int i=1;i<=k;i++){
        //         head=head.next;
        //     }
        //     return head;
        // }


        //optimised approach two pointer approach;

        while(fast!=null&& fast.next!=null  ){
            slow=slow.next;
            fast=fast.next.next;
        }
        head=slow;
        return head;
        
    }
}