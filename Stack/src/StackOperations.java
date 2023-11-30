import java.util.Stack;

public class StackOperations {

    static void stack_push(Stack<Integer> s) {
        for (int i = 0; i < 5; i++) {
            s.push(i);
            System.out.println("Pushing :- " + i);

        }

    }

    static void stack_pop(Stack<Integer> s) {

        for (int i = 0; i < 5; i++) {

            Integer j =  s.pop();

            System.out.println("Poping :- " + j);

        }

    }
    static void stack_peek(Stack<Integer> s) {

        Integer element =  s.peek();
            System.out.println("Top element :- " + element);


    }
    static void stack_search(Stack<Integer> s,int element) {

            Integer position =  s.search(element);
            if (position == -1)
                System.out.println("Element not found");
            else
                System.out.println("element is found at Postion : "+position);
    }




    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        stack_push(s);
        System.out.println("Stack : "+s);

        stack_pop(s);
        System.out.println("Stack : "+s);

        stack_push(s);
        System.out.println("Stack : "+s);
        stack_peek(s);
        stack_search(s, 2);
        stack_search(s, 6);
    }

}