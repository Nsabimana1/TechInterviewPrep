package DataStructures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new BasicLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.toString());
        System.out.println(list.size());
    }
}
