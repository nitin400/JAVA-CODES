class GfG
{
    
    public static Node find(Node node){
        Node temp=node;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    
    public static Node finding(Node head,Node tail){
        Node pivot=head;
        Node prev=head;
        Node current=head.next;
        
        while(current!=tail.next){
            if(pivot.data>current.data){
                int temp=prev.next.data;
                prev.next.data=current.data;
                current.data=temp;
                prev=prev.next;
            }
            
            current=current.next;
        }
        
        int temp=prev.data;
        prev.data=pivot.data;
        pivot.data=temp;
        
        return prev;
    }
    
    public static void solve(Node head,Node tail){
        if(head==null || tail==null || head==tail){
            return;
        }
        
        Node part=finding(head,tail);
        solve(head,part);
        solve(part.next,tail);
    }
    
    public static Node quickSort(Node head)
    {
        Node tail=find(head);
        
        if(head==null || head.next==null){
            return head;
        }
        
        solve(head,tail);
        
        return head;
        
    }
    
}
