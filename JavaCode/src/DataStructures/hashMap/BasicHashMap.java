package DataStructures.hashMap;

public class BasicHashMap<K, V> implements Map<K, V>{
    private Entry[] mapEntries;
    private int mapCapacity;
    private int size;

    public BasicHashMap(int capacity){
        this.mapEntries = new Entry[capacity];
        this.size = 0;
        this.mapCapacity = capacity;
    }

    @Override
    public void insert(K key, V value) {
        int hash = findHashValue(key);
        mapEntries[hash] = new Entry<K,V>(key, value);;
        size ++;
    }

    @Override
    public V get(K key) {
        int hash = findHashValue(key);
        if(mapEntries[hash] != null) return (V)mapEntries[hash].getValue();
        throw new IllegalStateException("Value for that that is not found");
    }

    @Override
    public V delete(K key) {
        int hashVal = findHashValue(key);
        V value = get(key);
        if(value != null){
            mapEntries[hashVal] = null;
            size --;
            hashVal = (hashVal + 1) % mapCapacity;
            while (mapEntries[hashVal] != null){
                Entry<K, V> tempEntry = mapEntries[hashVal];
                mapEntries[hashVal] = null;
                size --;
                this.insert(tempEntry.getKey(), tempEntry.getValue());
                hashVal = (hashVal + 1) % mapCapacity;
            }
        }
        return value;
    }

    @Override
    public boolean hasKey(K key) {
        int hashVal = findHashValue(key);
        if(mapEntries[hashVal] == null){
            return false;
        }else{
            if(mapEntries[hashVal].getKey().equals(key)) return true;
        }
        return false;
    }

    @Override
    public boolean hasValue(V value) {
        for(Entry e: this.mapEntries)  {
            if( e != null && e.getValue().equals(value)) return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private int findHashValue(K keyEntry){
        int hash = (keyEntry.hashCode() % this.mapCapacity);
        while (mapEntries[hash] != null && !mapEntries[hash].getKey().equals(keyEntry)){
            hash = (hash + 1) % this.mapCapacity;
        }
        return hash;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < mapCapacity; i++) {
            Entry<K,V> ent = mapEntries[i];
            if(ent != null) sb.append(ent.toString() + ",");
        }
        return sb.toString();
    }

    private class Entry<K, V>{
        private K key;
        private V value;
        public Entry(K key, V value){
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
        public String toString(){
            return "[" + this.key + ": " + this.value + "]";
        }
    }
}
