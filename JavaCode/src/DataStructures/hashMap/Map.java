package DataStructures.hashMap;

public interface Map<K,V> {
    void insert(K key, V value);
    V get(K key);
    V delete(K key);
    boolean hasKey(K key);
    boolean hasValue(V value);
    int size();
}
