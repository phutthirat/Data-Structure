import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private Node root;
    private Node parent;
    private Node deleteNode;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public Node getParent() {
        return parent;
    }

    public Node getDeleteNode() {
        return deleteNode;
    }

    public void printTree(Node node, int depth) {
        if (node != null) {
            printTree(node.right, depth + 1);
            System.out.println("    ".repeat(depth) + node.data);
            printTree(node.left, depth + 1);
        }
    }

    public void createTree1() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }

    public void createTree2() {
        root = new Node(15);
        root.left = new Node(8);
        root.right = new Node(23);
        root.left.left = new Node(4);
        root.left.right = new Node(11);
        root.left.left.left = new Node(2);
        root.right.left = new Node(19);
        root.right.left.right = new Node(20);
    }

    public void createTree3() {
        root = new Node(50);
        root.left = new Node(10);
        root.right = new Node(22);
        root.left.left = new Node(11);
        root.left.right = new Node(12);
        root.right.right = new Node(24);
        root.right.right.left = new Node(23);
    }

    //lab09
    public void createTree4() {
        int[] data = {10, 8, 15, 2, 9, 18, 14, 20, 11, 17};
        for (int i = 0; i<data.length; i++) {
            insert(data[i]);
        }
    }

    public void createTree5() {
        int[] data = {50, 30, 70, 10, 40, 60, 20, 45, 55, 65, 25};
        for (int i = 0; i<data.length; i++) {
            insert(data[i]);
        }
    }

    public void createTree6() {
        int[] data = {40, 20, 70, 30, 55, 85, 25, 35, 80, 32};
        for (int i = 0; i<data.length; i++) {
            insert(data[i]);
        }
    }

    public void insert(int new_data) {
        if (root != null) {
            Node current_node = root;
            while (true) {
                if (new_data < current_node.data) {
                    if (current_node.left == null) {
                        current_node.left = new Node(new_data);
                        break;
                    } else {
                        current_node = current_node.left;
                    }
                } else {
                    if (current_node.right == null) {
                        current_node.right = new Node(new_data);
                        break;
                    } else {
                        current_node = current_node.right;
                    }
                }
            }
        } else {
            root = new Node(new_data);
        }
    }

    public void searchDeleteNode (int target) {
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            Node current_node = queue.poll(); // ดึงตัวหน้าสุดของ queue

            parent = current_node;
            if (parent.data == target) {
                deleteNode = parent;
                break;
            }

            for (int i = 0; i < levelSize; i++) {
                if (current_node.left != null) {
                    if (current_node.left.data == target) {
                        deleteNode = current_node.left;
                        queue.clear(); // clear เพื่อให้ queue ว่างจะได้หลุดจาก while ใหญ่
                        break;
                    }
                    queue.add(current_node.left);
                }
                if (current_node.right != null) {
                    if (current_node.right.data == target) {
                        deleteNode = current_node.right;
                        queue.clear();
                        break;
                    }
                    queue.add(current_node.right);
                }
            }
        }
    }
        public void delete ( int target){
            searchDeleteNode(target);
            if (root == null) {
                System.out.println("Empty Tree");
            } else if (deleteNode == null) {
                System.out.println("Cannot found data");
            } else {

                // Case 1: Delete Leaf Node
                if (deleteNode.left == null && deleteNode.right == null) {
                    if (parent.left != null && parent.left.data == target) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
                // Case 2: Delete node with 2 child
                else if (deleteNode.left != null && deleteNode.right != null) {
                    Node successorParent = deleteNode;
                    Node successor = deleteNode.right;

                    while (successor.left != null) {
                        successorParent = successor;
                        successor = successor.left;
                    }

                    deleteNode.data = successor.data;

                    if (successorParent.left == successor) {
                        successorParent.left = successor.right;
                    } else {
                        successorParent.right = successor.right;
                    }
                }

                // Case 3: Delete node with 1 child
                else {
                    if (deleteNode.left != null) {
                        if (parent.left != null && parent.left.data == deleteNode.data) {
                            parent.left = deleteNode.left;
                        } else {
                            parent.right = deleteNode.left;
                        }
                    } else {
                        if (parent.left != null && parent.left.data == deleteNode.data) {
                            parent.left = deleteNode.right;
                        } else {
                            parent.right = deleteNode.right;
                        }
                    }
                }
            }
        }


        public Node findNode ( int N){
            if (root == null) {
                return null;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node current = queue.poll();

                if (current.data == N) {
                    return current;
                }

                // add left child to queue
                if (current.left != null) {
                    queue.add(current.left);
                }

                // add right child to queue
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            return null;
        }
    }


