import java.util.LinkedList;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(List.of("Java", "Python", "C", "Script"));
        System.out.println(ll);
        String str = ll.remove(2);
        System.out.println("remove elements: " + str);
        System.out.println(ll);
    }
}

