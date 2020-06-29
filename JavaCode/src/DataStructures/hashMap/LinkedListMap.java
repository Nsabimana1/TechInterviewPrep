package DataStructures.hashMap;

public class LinkedListMap<K,V> implements Map<K,V> {
    private EntryNode[] mapArray;
    private int size;
    private int capacity;

    public LinkedListMap(int capacity){
        this.capacity = capacity;
        this.mapArray = new EntryNode[capacity];
        this.size = 0;
    }

    private int findHashValue(K key){
        return key.hashCode() % this.capacity;
    }

    @Override
    public void insert(K key, V value) {
        int hashVal = findHashValue(key);
        Item<K, V> newNodeItem = new Item<>(key, value);
        if(mapArray[hashVal] == null){
            mapArray[hashVal] = new EntryNode<>(newNodeItem);
        }else{
            EntryNode head = mapArray[hashVal];
            EntryNode tempNode = head;
            while (tempNode.nextNode != null){
                tempNode = tempNode.nextNode;
            }
            EntryNode newEntryNode = new EntryNode<>(newNodeItem);
            tempNode.setNextNode(newEntryNode);
        }
        size ++;
    }

    @Override
    public V get(K key) {
        int hashVal = findHashValue(key);
        EntryNode head = mapArray[hashVal];
        if(head == null) throw new IllegalStateException("value not found");
        EntryNode tempNode = head;
        while (tempNode != null && !tempNode.getItem().getKey().equals(key)){
            tempNode = tempNode.nextNode;
        }
        if(tempNode == null) throw new IllegalStateException("value not found");
        return (V) tempNode.getItem().getValue();
    }

    @Override
    public V delete(K key) {
        V valueToDelete = get(key);
        if(valueToDelete != null){
            int hashVal = findHashValue(key);
            EntryNode head = mapArray[hashVal];
            if (head.getItem().getKey().equals(key)) {
                EntryNode next = head.getNextNode();
                mapArray[hashVal] = next;
            }else{
                System.out.println("I was here");
                EntryNode prevNode = head;
                EntryNode tempNode = head;
                while (tempNode != null && !tempNode.getItem().getKey().equals(key)){
                    prevNode = tempNode;
                    tempNode = tempNode.nextNode;
                }
                EntryNode nexNode = tempNode.getNextNode();
                prevNode.setNextNode(nexNode);
            }
            size --;
            return valueToDelete;
        }
        throw new IllegalStateException("no item found to delete");
    }

    @Override
    public boolean hasKey(K key) {
        V value = get(key);
        return value != null;
    }

    @Override
    public boolean hasValue(V value) {
        for (int i = 0; i < this.capacity; i++) {
            EntryNode currentNode = mapArray[i];
            if(currentNode != null){
                while (currentNode != null){
                    if(currentNode.getItem().getValue().equals(value)) return true;
                    currentNode = currentNode.getNextNode();
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.capacity; i++) {
            EntryNode currentNode = mapArray[i];
            if(currentNode != null){
                while (currentNode != null){
                    sb.append(currentNode.getItem().toString());
                    currentNode = currentNode.getNextNode();
                    if (currentNode != null) sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private class EntryNode<K,V>{
        private Item<K,V> item;
        private EntryNode<K,V> nextNode;
        public EntryNode(Item<K, V> item){
            this.item = item;
            this.nextNode = null;
        }
        public EntryNode<K, V> getNextNode() {
            return nextNode;
        }
        public void setNextNode(EntryNode<K, V> nextNode) {
            this.nextNode = nextNode;
        }
        public Item<K, V> getItem() {
            return item;
        }
    }

    private class Item<K,V>{
        private K key;
        private V value;
        public Item(K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "[" + key.toString() + ":" + value.toString() + "]";
        }
    }
}
