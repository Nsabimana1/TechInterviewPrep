package DataStructures.queue;

public interface Queue<E> {
    void enQueue(E item);
    E deQueue();
    int size();
    boolean contains(E item);
    E access(int index);
}
