import java.util.Scanner;

public class TreeApp4 {
    public static void main(String[] args) {
        BinaryTree tree6 = new BinaryTree();
        tree6.createTree6();
        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree6()");
        System.out.println("------------------------------");
        tree6.printTree(tree6.getRoot(), 0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target node (N): ");
        int N = scanner.nextInt();

        Node targetNode = tree6.findNode(N);

        if (targetNode == null) {
            System.out.println("Cannot found Node(data=" + N + ")");
        } else {
            if (targetNode.left != null) {
                System.out.println("Left Child: " + targetNode.left.data);
            } else {
                System.out.println("No Left Child");
            }

            if (targetNode.right != null) {
                System.out.println("Right Child: " + targetNode.right.data);
            } else {
                System.out.println("No Right Child");
            }

            if (targetNode.left == null && targetNode.right == null) {
                System.out.println("[" + N + "] is Leaf Node");
            } else {
                System.out.println("[" + N + "] is not Leaf Node");
            }
        }

        scanner.close();
    }
}