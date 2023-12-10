import java.util.ArrayList;
import java.util.Collections;

public class Routing {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        Collections.reverse(num);
        System.out.println("Reversed arrea" + num);

        Collections.swap(num,0,2);
        System.out.println("Swapped Array: "+ num);

        ArrayList<Integer> newNum = new ArrayList<>();

        newNum.addAll(num);
        System.out.println("After Added Array: "+ newNum);

        Collections.fill(num,0);
        System.out.println("Filled Array: "+ num);

        Collections.copy(newNum, num);
        System.out.println("Coppied Array : "+ newNum);
    }
}
