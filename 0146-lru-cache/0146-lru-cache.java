class LRUCache {
    private class Node{
        int key,value;
        Node prev,next;
        Node(int key,int val){
            this.key=key;
            this.value=val;
        }
    }
    private Map<Integer,Node> map;
    private Node head,tail;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        Node node=map.get(key);
        if(node==null)
            return -1;
        moveToHead(node);
        return node.value;
        
    }
    
    public void put(int key, int value) {
        Node node=map.get(key);
        if(node!=null){
            node.value=value;
            moveToHead(node);
        }
        else{
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            addToHead(newNode);
            //if capacity exceeds
            if(map.size()>capacity){
               Node tailNode= removeTail();
                map.remove(tailNode.key);
            }
        }
    }
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void addToHead(Node node){
        node.next=head.next;
        head.next.prev=node;
        node.prev=head;
        head.next=node;
    }
    private void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }
    private Node removeTail(){
        Node node=tail.prev;
        removeNode(node);
        return node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */