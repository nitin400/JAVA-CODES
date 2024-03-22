

class AllOne {
    private final Map<String, ListNode> keyToNode;
    private final Map<Integer, DoublyLinkedList<ListNode>> countToList;

    private final Map<Integer, CountNode> countToNode;
    private final DoublyLinkedList<CountNode> countList;

    /** Initialize your data structure here. */
    public AllOne() {
        this.keyToNode = new HashMap<>();
        this.countToList = new HashMap<>();

        this.countToNode = new HashMap<>();
        this.countList = new DoublyLinkedList<>();
    }
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(final String key) {
        final ListNode listNode;

        if(this.keyToNode.containsKey(key)) {
            listNode = this.keyToNode.get(key);
            final DoublyLinkedList<ListNode> prevCountList = this.countToList.get(listNode.count);

            removeNodeFromList(listNode);
            addNextCountNode(listNode.count);

            if(prevCountList.isEmpty()) {
                removeNodeFromList(this.countToNode.get(listNode.count));
                this.countToNode.remove(listNode.count);
                this.countToList.remove(listNode.count);
            }

            listNode.count++;
        } else {
            listNode = new ListNode(key, 1);

            this.keyToNode.put(key, listNode);

            if(!this.countToNode.containsKey(listNode.count)) {
                final CountNode countNode = new CountNode(listNode.count);

                this.countList.addFirst(countNode);
                this.countToNode.put(countNode.count, countNode);
            }
        }

        this.countToList.putIfAbsent(listNode.count, new DoublyLinkedList());
        this.countToList.get(listNode.count).addFirst(listNode);
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(final String key) {
        final ListNode listNode = this.keyToNode.get(key);

        if(listNode.count == 1)
            this.keyToNode.remove(key);
        else
            this.addPrevCountNode(listNode.count);

        final DoublyLinkedList<ListNode> prevCountList = this.countToList.get(listNode.count);

        removeNodeFromList(listNode);

        if(prevCountList.isEmpty()) {
            removeNodeFromList(this.countToNode.get(listNode.count));
            this.countToNode.remove(listNode.count);
            this.countToList.remove(listNode.count);
        }

        if(listNode.count != 1) {
            listNode.count--;
            this.countToList.putIfAbsent(listNode.count, new DoublyLinkedList());
            this.countToList.get(listNode.count).addFirst(listNode);
        }
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        return this.countList.isEmpty() ? "" : this.countToList.get(this.countList.getLast().count).getFirst().key;
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        return this.countList.isEmpty() ? "" : this.countToList.get(this.countList.getFirst().count).getFirst().key;
    }

    private void removeNodeFromList(final CountNode listNode) {
        if(listNode == null)
            return;

        if(listNode.prev != null)
            listNode.prev.next = listNode.next;

        if(listNode.next != null)
            listNode.next.prev = listNode.prev;
    }

    private void addNextCountNode(final int count) {
        final CountNode currNode = this.countToNode.get(count);

        if(currNode.count + 1 != currNode.next.count) {
            CountNode newNode = new CountNode(count + 1);

            newNode.prev = currNode;
            newNode.next = currNode.next;

            currNode.next.prev = newNode;
            currNode.next = newNode;

            this.countToNode.put(newNode.count, newNode);
        }
    }

    private void addPrevCountNode(final int count) {
        final CountNode currNode = this.countToNode.get(count);

        if(currNode.count - 1 != currNode.prev.count) {
            CountNode newNode = new CountNode(count - 1);

            newNode.next = currNode;
            newNode.prev = currNode.prev;

            currNode.prev.next = newNode;
            currNode.prev = newNode;

            this.countToNode.put(newNode.count, newNode);
        }
    }

    private class CountNode {
        public CountNode prev, next;
        public int count;

        public CountNode(final int count) {
            this.count = count;
        }
    }
    
    private final class ListNode extends CountNode {
        public final String key;

        public ListNode(final String key, final int count) {
            super(count);
            this.key = key;
        }
    }

    private final class DoublyLinkedList<T extends CountNode> {
        private final CountNode head, tail;

        public DoublyLinkedList() {
            this.head = new CountNode(-1);
            this.tail = new CountNode(-1);

            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        public void addFirst(final T listNode) {
            listNode.next = this.head.next;
            listNode.prev = this.head;

            this.head.next.prev = listNode;
            this.head.next = listNode;
        }

        public T getLast() {
            return this.isEmpty() ? null : (T) this.tail.prev;
        }

        public T getFirst() {
            return this.isEmpty() ? null : (T) this.head.next;
        }

        public boolean isEmpty() {
            return this.head.next == this.tail;
        }
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */