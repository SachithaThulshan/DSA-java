import java.util.ArrayList;
import java.util.Collections;

public class Compossition {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);

        int count = Collections.frequency(num,2);
        System.out.println("count of 2: "+ count);
        int min = Collections.min(num);
        System.out.println(min);

        ArrayList<Integer> newNum = new ArrayList<>();
        newNum.add(1);
        newNum.add(2);
        newNum.add(3);
        newNum.add(4);

        boolean ans = Collections.disjoint(num, newNum);
        System.out.println("Lists are disjoint "+ ans);
        int max =Collections.max(newNum);
        System.out.println(max);


    }
}
