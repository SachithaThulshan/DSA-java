import java.util.ArrayList;
import java.util.Collections;

public class Searching {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        int poss = Collections.binarySearch(num, 3);
        System.out.println("Possition of is:- "+ poss);
    }
}
