import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {

    public static String reverseCharacter(String original) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello World";
        System.out.println("Original => " + original);
        String reverse = reverseCharacter(original);
        System.out.println("Reverse  => " + reverse);
    }
}