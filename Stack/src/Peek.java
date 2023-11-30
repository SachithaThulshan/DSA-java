import java.util.Stack;

public class Peek {
    public static void main(String[] args) {
        Stack<Integer> s1 =new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println("Peek: "+ s1.peek());
        System.out.println("Position of 20: "+ s1.search(20));
        System.out.println("is Stack Empty: "+ s1.empty());//isEmpty();
    }
}
