import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TraverseBFS {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree3();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
		//50 10 22 11 12 24 23

	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (node != null) {
			Queue<Node> queue = new ArrayDeque<Node>();
			queue.add(node);
			
			 //list.add(node.data);
			while (!queue.isEmpty()) {
				
				int levelSize = queue.size();
				
				for (int i = 0; i<levelSize; i++) {
					Node current_node = queue.poll();
					
					if (current_node.left != null) {
						queue.add(current_node.left);
						//list.add(current_node.left.data);
					}
					if (current_node.right != null) {
						queue.add(current_node.right);
						//list.add(current_node.right.data);
					}
					 list.add(current_node.data);
					
				}
				
			}
            
		}
		
		return list;
	}

}
