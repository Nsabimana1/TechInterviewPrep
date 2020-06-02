package DataStructures.stack;

import java.util.Objects;

public class BasicStack<E> implements Stack<E> {
    private E [] stackArray;
    private  int stackPointer;

    public BasicStack(){
        stackArray = (E []) new Object[2];
        stackPointer = 0;
    }

    public  void resize(){
        E [] tempArray = (E []) new Object[stackPointer * 2];
        for (int i = 0; i < stackPointer ; i++) {
            tempArray[i] = stackArray[i];
        }
        stackArray = tempArray;
    }

    @Override
    public void push(E item) {
        if(stackPointer >= stackArray.length){
            resize();
        }
        stackArray[stackPointer++] = item;
    }

    @Override
    public E pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("not items to pop");
        }
        return stackArray[stackPointer --];
    }

    @Override
    public int size() {
        return stackPointer;
    }

    @Override
    public boolean contains(Object item) {
        for (int i = 0; i < stackPointer; i++) {
            if(stackArray[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E access(Object item) {
        while(stackPointer > 0){
            E tempItem = pop();
            if (item.equals(tempItem)) return  tempItem;
        }
        throw new IllegalStateException("Could not find the item");
    }
}
