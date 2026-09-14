public class TreeApp2 {
    public static void main(String[] args) {
        BinaryTree tree4 = new BinaryTree();
        tree4.createTree4();
        System.out.println("------------------------------");
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");
        tree4.printTree(tree4.getRoot(), 0);

        System.out.println("------------------------------");

        BinaryTree tree5 = new BinaryTree();
        tree5.createTree5();
        System.out.println("Binary Tree from createTree5()");
        System.out.println("------------------------------");
        tree5.printTree(tree5.getRoot(), 0);

        System.out.println("------------------------------");

        BinaryTree tree6 = new BinaryTree();
        tree6.createTree6();
        System.out.println("Binary Tree from createTree6()");
        System.out.println("------------------------------");
        tree6.printTree(tree6.getRoot(), 0);
    }
}
