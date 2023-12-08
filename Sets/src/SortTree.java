import java.util.TreeSet;

public class SortTree {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        //ascending - arohana descending - avarohana

        System.out.println("Tree set: " + set);
        System.out.println(" Reverse Tree set: " + set.descendingSet());
        System.out.println("Top Tree set: " + set.headSet("C",true));
        System.out.println("Remove Tree set: " + set.subSet("A",false,"E",true));
        System.out.println("bottom Tree set: " + set.tailSet("C",false));


    }
}
