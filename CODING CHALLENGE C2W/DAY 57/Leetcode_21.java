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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//APPROACH 1 - O(N) - SPACE COMPLEXITY

        // ListNode temp1=list1;
        // ListNode temp2=list2;
        // ListNode head=new ListNode(100);
        // ListNode temp3=head;

        // while(temp1!=null && temp2!=null){
        //     if(temp1.val<temp2.val){
        //         ListNode a=new ListNode(temp1.val);
        //         temp3.next=a;
        //         temp3=a;
        //         temp1=temp1.next;
        //     }
        //     else{
        //         ListNode a=new ListNode(temp2.val);
        //         temp3.next=a;
        //         temp3=a;
        //         temp2=temp2.next;
        //     }
        // }

        // if(temp1==null){
        //     temp3.next=temp2;
        // }else{
        //     temp3.next=temp1;
        // }

        // head=head.next;
        // return head;

        // APPROACH 2 - O(1) - SPACE COMPLEXITY.

        ListNode temp1=list1;
        ListNode temp2=list2;

        ListNode n=new ListNode(100);
        ListNode temp3=n;

        while(temp1!=null && temp2!=null){

            if(temp1.val <temp2.val){
                temp3.next=temp1;
                temp3=temp3.next;
                temp1=temp1.next;
            }else{
                temp3.next=temp2;
                temp3=temp3.next;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp3.next=temp2;

        }else{
            temp3.next=temp1;
        }

        return n.next;
        
    }
}