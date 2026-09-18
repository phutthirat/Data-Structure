
public class BSTApp1 {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(),0);
		
		System.out.println();
		System.out.println("Minimum node is " +tree.findMinimum(tree.getRoot()));
		
		
		System.out.println("Maximum node is " +tree.findMaximum(tree.getRoot()));
		
		int target = 15;
		System.out.println("Is " + target + " in BST =>" + tree.findSpecificData(target));
		
		int delNode = 60;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent = " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data);
		
		tree.delete(delNode);
		tree.printTree(tree.getRoot(),0);

	}

}
