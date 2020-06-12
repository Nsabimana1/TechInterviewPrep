package DataStructures.queue;

public class BasicQueue<E> implements Queue<E> {
    private E [] arrayQueue;
    private int head;
    private int tail;
    private int size;

    public BasicQueue(){
        arrayQueue = (E []) new Object[20];
        head = 0;
        tail = 0;
    }

    public  void resize(){
        E [] tempArray = (E []) new Object[size * 2];
        for (int i = 0; i < size ; i++) {
            tempArray[i] = arrayQueue[i];
        }
        arrayQueue = tempArray;
    }

    @Override
    public void enQueue(E item) {
//        if(size > 0 && head == tail){
//            resize();
//        }

//        if(tail == arrayQueue.length) tail = 0;

//        int index = tail++ & arrayQueue.length;
        arrayQueue[tail++] = item;
        size ++;
    }

    @Override
    public E deQueue() {
        if(head == tail) {
            throw new IllegalStateException("not items remaining");
        }
        size --;
        return arrayQueue[head ++];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E item) {
        for(int i = head; i < tail; i ++){
            if(arrayQueue[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public E access(int index) {
        if(this.size == 0 || index > this.size) throw new IllegalArgumentException("No item at that index");
        for (int i = head; i < tail ; i++) {
            if(i == index) return arrayQueue[i];
        }
        throw new IllegalArgumentException("could not find item at that position");
    }

    @Override
    public String toString(){
        String valStr = "[";
        for(int i = head; i < tail; i ++){
            valStr += arrayQueue[i] + ",";
        }
        valStr += "]";
        return valStr;
    }
}
