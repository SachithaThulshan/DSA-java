import java.util.TreeSet;

public class setTree {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(48);
        ts.add(123);
        ts.add(41);
        ts.add(34);
        ts.add(14);
        System.out.println(ts);

        System.out.println("Lowest value: "+ ts.pollFirst());
        System.out.println("Highest value: "+ ts.pollLast());
    }
}
