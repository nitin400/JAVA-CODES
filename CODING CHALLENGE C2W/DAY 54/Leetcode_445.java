class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1=0,size2=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null || temp2!=null){
            if(temp1==null){size2+=1; temp2=temp2.next;}
            else if(temp2==null) {size1+=1;temp1=temp1.next;}
            else{
                temp1=temp1.next;
                temp2=temp2.next;
                size1+=1;
                size2+=1;
            }
        }
        temp1=l1;
        temp2=l2;
        ListNode ans= new ListNode(0);
        int i=0;
        if(size1>size2){
             i=helper(temp1,temp2,ans,size1,size2);
        }
        else{
            i=helper(temp2,temp1,ans,size2,size1);
        }
        if(i==1){
            ListNode ans1=new ListNode(1);
            ans1.next=ans;
            return ans1;
        }
        return ans;
    }
    public int helper(ListNode l1,ListNode l2,ListNode ans,int size1,int size2){
        if(size1==0) return 0;
        if(size1>size2 && size1>0){
            if(size1-1>0) ans.next=new ListNode(0);
            ans.val=l1.val+helper(l1.next,l2,ans.next,size1-1,size2);
        }
        if(size1==size2 && size1>0){
            if(size1-1>0) ans.next=new ListNode(0);
            ans.val=l1.val+l2.val+helper(l1.next,l2.next,ans.next,size1-1,size2-1);
        }
        if(ans.val>=10){
            ans.val-=10;
            return 1;
        }
        return 0;
        }
}