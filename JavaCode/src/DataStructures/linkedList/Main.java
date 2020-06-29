package DataStructures.linkedList;

import javax.swing.text.Style;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new BasicLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("removing item");
        list.remove();
        System.out.println(list);
        System.out.println("removing item at index 1");
        System.out.println(list.removeAt(1));
        System.out.println(list);
        System.out.println("removing item at index 3");
        System.out.println(list.removeAt(3));
        System.out.println(list);
        System.out.println("INSERTING item (7) at index 2");
        list.insert(7, 2);
        System.out.println(list);
        System.out.println("item at index 4 is: " + list.get(4));
        System.out.println("item 7 is found at position: " + list.find(7));
    }
}
