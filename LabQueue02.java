import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some message: ");
        String message = input.next();

        System.out.println();
        System.out.println("Check Palindrome by Deque = "
                + (checkByDeque(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Check Palindrome by Stack = "
                + (checkByStack(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));

    }

    public static boolean checkByDeque(String message) {
        Deque<Character> letters = new ArrayDeque<Character>();

        for (int i = 0; i < message.length(); i++) {
            letters.addLast(message.charAt(i));
        }

        while (letters.size() > 1) {
            char first = letters.pollFirst();
            char last = letters.pollLast();
            if (first != last) {
                return false;
            }
        }
        return true;

    }

    public static boolean checkByStack(String message) {
        Queue<Character> queue = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            queue.add(c);
            stack.push(c);
        }
        while (!queue.isEmpty()) {
            char qChar = queue.poll();
            char sChar = stack.pop();
            if (qChar != sChar) {
                return false;
            }
        }
        return true;
    }

}