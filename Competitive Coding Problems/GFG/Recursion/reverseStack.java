import java.util.Scanner;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    static void reverseStack(Stack stack, int i) {
        if (stack.size() == 0)
            return;
        Stack<Integer> scopy = new Stack<>();
        scopy.clone(stack);
        stack.clear();
        while (scopy.size() != 0) {
            stack.push(scopy.peek());
            scopy.pop();
        }
    }

}
