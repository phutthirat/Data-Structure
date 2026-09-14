public class TreeApp3 {
    public static void main(String[] args) {
        BinaryTree tree5 = new BinaryTree();
        tree5.createTree5();
        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");
        tree5.printTree(tree5.getRoot(), 0);

        System.out.println("\n------Delete: Leaf Node------");
        tree5.delete(25);
        tree5.printTree(tree5.getRoot(), 0);

        System.out.println("\n---Delete Node with 1 Child---");
        tree5.delete(10);
        tree5.printTree(tree5.getRoot(), 0);

        System.out.println("\n---Delete Node with 2 Child---");
        tree5.delete(40);
        tree5.printTree(tree5.getRoot(), 0);
    }
}
