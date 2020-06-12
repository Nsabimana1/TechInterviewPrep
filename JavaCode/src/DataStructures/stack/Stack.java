package DataStructures.stack;

public interface Stack<E> {
    void push(E item);
    E pop();
    boolean contains(E item);
    E access(E item);
    int size();

    default int add(){
        return 8;
    }
}
