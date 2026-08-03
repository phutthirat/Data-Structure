import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enqueue: ");
            int number = input.nextInt();
            queue.add(number);
        }

        System.out.println("Queue => " + queue);
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.println("Calling number: " + queue.peek());
            System.out.println("Providing service number: " + queue.poll());
            System.out.println();
        }

        System.out.println("Queue => " + queue);

        input.close();
    }
}