import java.util.ArrayList;
import java.util.Collections;

public class Shuffling {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(25);
        num.add(762);
        num.add(72);
        num.add(82);
        num.add(55);
        num.add(222);
        num.add(52);
        num.add(25);
        num.add(22);
        num.add(24);

        Collections.shuffle(num);
        System.out.println("Shuffled List: "+ num);
    }
}
