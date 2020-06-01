package DataStructures.stack;

import java.util.Objects;

public class ArrayStack<E> implements Stack {
    private E [] stackArray;
    private  int stackPointer;

    public ArrayStack(){
        stackArray = (E []) new Objects[100];
        stackPointer = 0;
    }

    @Override
    public void push(Object item) {

    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public Object access(Object item) {
        return null;
    }
}
