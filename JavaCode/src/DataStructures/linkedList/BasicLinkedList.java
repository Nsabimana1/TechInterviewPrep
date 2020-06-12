package DataStructures.linkedList;

public class BasicLinkedList<E> implements LinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public BasicLinkedList(){
        this.first = null;
        this.last = null;
        this.size  = 0;
    }

    @Override
    public void add(E item) {
        if(size == 0) {
            first = new Node<>(item);
            last = first;
        }else{
            Node newNode = new Node(item);
            last.setNext(newNode);
            last = newNode;
        }
        size ++;
    }

    @Override
    public E remove() {
        if(size == 0) throw new IllegalStateException("No more items remaining");
        E item = first.getItem();
        first = first.getNext();
        size --;
        return item;
    }

    @Override
    public void insert(int i, E item) {
        if(i > size) throw new IllegalStateException("Wrong index parameter");
        int tempIndex = 0;
        Node<E> curNode = first;
        Node<E> newNode = new Node<>(item);
        while(tempIndex != i){
            curNode = curNode.getNext();
            tempIndex ++;
        }
        Node<E> nextToCur= curNode.getNext();
        curNode.setNext(newNode);
        newNode.setNext(nextToCur);
        size ++;
    }

    @Override
    public E removeAt(int i) {
        return null;
    }

    @Override
    public int find(E item) {
        return 0;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public boolean contains(E item) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString(){
        System.out.println("I was here");
        String val = "";
        Node tempNode = first;
        while(tempNode.getNext() != null){
            val += tempNode.getItem().toString() + "," ;
        }
        return  val;
    }
}

