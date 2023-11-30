import java.util.LinkedList;
import java.util.List;

public class ChangeElements {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(List.of("Java", "Python", "C", "Script"));
        System.out.println(ll);
        ll.set(3,"C++");
        System.out.println(ll);
    }
}
