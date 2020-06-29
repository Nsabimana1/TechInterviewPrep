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
    public void insert(E item, int i) {
        if(i > size) throw new IllegalStateException("Wrong index parameter");
        int tempIndex = 1;
        Node<E> curNode = first;
        Node<E> prevNode = first;
        Node<E> newNode = new Node(item);
        while(tempIndex < i && curNode != null){
            prevNode = curNode;
            curNode = curNode.getNext();
            tempIndex ++;
        }

        Node<E> nextToCur = curNode;
        prevNode.setNext(newNode);
        newNode.setNext(nextToCur);
        size ++;
    }

    @Override
    public E removeAt(int i) {
        if(i > size) throw new IllegalStateException("Wrong index parameter");
        Node<E> curNode = first;
        Node<E> prevNode = first;
        int tempIndex = 1;
        while(tempIndex < i && curNode != null){
            prevNode = curNode;
            curNode = curNode.getNext();
            tempIndex ++;
        }
        E item = curNode.getItem();
        if(i == 1){
            first = first.getNext();
        }else {
            Node<E> nexNode = curNode.getNext();
            prevNode.setNext(nexNode);
        }
        this.size --;
        return item;
    }

    @Override
    public int find(E item) {
        if (this.first == null) throw  new IllegalStateException("No elements in the list");
        Node curNode = first;
        int index = 1;
        while (curNode != null){
            if (curNode.getItem() == item) return index;
            index ++;
            curNode = curNode.getNext();
        }
        throw new IllegalStateException("No such item found");
    }

    @Override
    public E get(int i) {
        if (i > size) throw  new IllegalStateException("No element out side of the list");
        Node<E> curNode = first;
        int tempIndex = 1;
        while(tempIndex < i && curNode != null){
            curNode = curNode.getNext();
            tempIndex ++;
        }
        E item = curNode.getItem();
        return item;
    }

    @Override
    public boolean contains(E item) {
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString(){
//        StringBuffer sb = new StringBuffer();
//        Node<E> curNode = first;
//        int counter = 0;
//        while(curNode != null){
//            sb.append(curNode.getItem());
//
//            System.out.println(curNode.getItem());
//            curNode = curNode.getNext();
////            System.out.println("we are printing the " + counter++ + " th element");
//            if (curNode != null){
//                sb.append(",");
//            }
//        }
        String val = "";
        Node tempNode = first;
        while(tempNode != null){
            val += tempNode.getItem().toString() ;
            tempNode = tempNode.getNext();
            if (tempNode != null) val += ",";
        }
        return val.toString();
    }
}

