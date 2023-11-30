import java.util.LinkedList;
import java.util.List;

public class AddNewElements {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(List.of(10,20,30,40));
        System.out.println(ll);
        ll.add(2,25);
        System.out.println(ll);

    }
}
