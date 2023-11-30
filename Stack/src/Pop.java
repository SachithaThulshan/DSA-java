import java.util.Stack;

public class Pop {
    public static void main(String[] args) {
        Stack<Integer> s1 =new Stack<>();
        Stack <String> s2 = new Stack<>();

        s1.push(21);
        s1.push(22);
        s1.push(33);
        s2.push("Mac");
        s2.push("MS");
        s2.push("Linux");

        System.out.println("Before Stack 1: "+ s1);
        System.out.println("Before Stack 2: "+ s2);
        s1.pop();
        s2.pop();
        s1.pop();
        System.out.println("After Stack 1: "+ s1);
        System.out.println("After Stack 2: "+ s2);
    }
}
