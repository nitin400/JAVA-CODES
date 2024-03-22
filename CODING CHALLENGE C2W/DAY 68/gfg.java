Node copyList(Node head) {
    // your code here
    // TC O(n) SC O(n)
    HashMap<Node,Node> map= new HashMap<>();
    Node temp=head;
    while(temp!=null)
    {
        map.put(temp,new Node(temp.data));
        temp=temp.next;
    }
    temp = head;
    while(temp!=null)
    {
        if(map.get(temp.next)!=null)
        {
            map.get(temp).next=map.get(temp.next);
        }
        if(map.get(temp.arb)!=null)
        {
            map.get(temp).arb=map.get(temp.arb);
        }
        temp=temp.next;
    }
    return map.get(head);
    
}
