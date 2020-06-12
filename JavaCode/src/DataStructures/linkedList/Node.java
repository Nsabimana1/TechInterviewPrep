package DataStructures.linkedList;

public class Node<E> {
    private E item;
    private Node next;

    public Node(E item){
        this.item = item;
        next = null;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    public E getItem(){
        return item;
    }
}
