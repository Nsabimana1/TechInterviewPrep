package DataStructures.linkedList;

public interface LinkedList<E> {
    void add(E item);
    E remove();
    void insert(E item, int position);
    E removeAt(int i);
    int find(E item);
    E get(int i);
    boolean contains(E item);
    int size();
}
