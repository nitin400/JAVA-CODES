
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        if(head==null){
            return null;
        }

        while(fast!=null){
             
            if(slow==null)
            return null;
            slow=slow.next;
            if(fast.next==null)
            return null;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }


        }

        ListNode temp=head;

        while(slow!=temp){
            if(slow==null){
                return null;
            }
            slow=slow.next;
            temp=temp.next;
        }
        return slow;
        
    }
}