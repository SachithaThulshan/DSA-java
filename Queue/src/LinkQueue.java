import java.util.LinkedList;
import java.util.Queue;

public class LinkQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        //offer - data insert, enqueue(concept)
        number.offer(250);
        number.offer(222);
        number.offer(111);
        number.add(55);
        number.add(7854);

        System.out.println("Enqueue :"+ number);
        System.out.println("Top Element :"+ number.peek());
        //poll - data remove, dequeue(concept)

        System.out.println("Dequeue : " + number.poll());
        System.out.println("update Queue : " + number);
    }
}
