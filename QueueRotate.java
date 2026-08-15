import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
    public static Queue<Integer> queue = new ArrayDeque<Integer>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        originalQueue();

        while (true) {
            System.out.print("Press 1 to rotate queue: ");
            String choice = input.next();
            if (choice.equals("1")) {
                rotateQueue();
            } else {
                System.out.println("Exit");
                break;
            }
        }

        input.close();
    }

    public static void rotateQueue() {
        if (!queue.isEmpty()) {
            int head = queue.poll();
            System.out.println("Calling queue: " + head);
            queue.add(head);
        }
        System.out.println("Queue => " + queue);
    }

    public static void originalQueue() {
        queue.clear();
        for (int i = 101; i <= 107; i++) {
            queue.add(i);
        }
        System.out.println("Queue => " + queue);
    }

}