import java.util.LinkedList;
import java.util.List;

public class GetElements {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(List.of("Java", "Python", "C", "Script"));
        System.out.println(ll);
        String str = ll.get(2);
        System.out.println(str);
    }
}
