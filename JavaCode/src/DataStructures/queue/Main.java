package DataStructures.queue;

public class Main {
    public static void main(String[] args){
        Queue<Integer> numberQueue = new BasicQueue<>();
        numberQueue.enQueue(1);
        numberQueue.enQueue(3);
        System.out.println("the size is: " + numberQueue.size());
        numberQueue.enQueue(4);
        System.out.println(numberQueue.deQueue());
        System.out.println("the size is: " + numberQueue.size());
        numberQueue.enQueue(5);
        System.out.println(numberQueue.deQueue());
        System.out.println("the size is: " + numberQueue.size());
        System.out.println(numberQueue.toString());
    }
}
