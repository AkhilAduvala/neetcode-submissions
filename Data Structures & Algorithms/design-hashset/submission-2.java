class MyHashSet {

    private static class ListNode{
        int key;
        ListNode next;

        ListNode(int key){
            this.key = key;
        }
    }

    private ListNode[] hashtable;

    public MyHashSet() {
        hashtable = new ListNode[10000];
        for(int i = 0; i < 10000; i++){
            hashtable[i] = new ListNode(0);
        }
    }
    
    public void add(int key) {
        ListNode current = hashtable[key % 10000];
        while(current.next != null){
            if(current.next.key == key){
                return;
            }
            current = current.next;
        }

        current.next = new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode current = hashtable[key % 10000];

        while(current.next != null) {
            if(current.next.key == key){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        
    }
    
    public boolean contains(int key) {
        ListNode current = hashtable[key % 10000];
        while(current.next != null){
            if(current.next.key == key){
                return true;
            }
            current = current.next;
        }
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */