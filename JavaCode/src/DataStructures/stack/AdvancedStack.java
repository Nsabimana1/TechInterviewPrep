package DataStructures.stack;

import java.util.ArrayList;

public class AdvancedStack<E> implements Stack<E> {
    private ArrayList<E> stackArray;

    public AdvancedStack(){
        stackArray = new ArrayList<>();
    }
    @Override
    public void push(E item) {
        stackArray.add(item);
    }

    @Override
    public E pop() {
        return stackArray.remove(size() - 1);
    }

    @Override
    public boolean contains(E item) {
        return stackArray.contains(item);
    }

    @Override
    public E access(E item) {
        return stackArray.get(stackArray.indexOf(item));
    }

    @Override
    public int size() {
        return stackArray.size();
    }
}
