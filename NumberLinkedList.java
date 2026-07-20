public class NumberLinkedList {

    public static void main(String[] args) {

        LinkedList number = new LinkedList();

        number.insert(0, 37);
        number.insert(0, 7);
        number.insert(0, 4);
        number.insert(0, 16);
        System.out.println("All element = "+number.traversal());

        number.insert(2,20);
        System.out.println("Insert 20 to index 2 = "+number.traversal());

        number.insert(25);
        System.out.println("Append 25 into list = "+number.traversal());

        number.remove(0);
        System.out.println("Deleted the first element = "+number.traversal());

        number.remove(2);
        System.out.println("Deleted element index 2 = "+number.traversal());

        number.removeLastElement();
        System.out.println("Deleted the last element = "+number.traversal());

        System.out.println("\nLength of elements in List = " + number.length());

        System.out.println("Element in index 1 = " + number.get(1));

        number.set(1, 100);
        System.out.println("Updated index 1 to 100 = " + number.traversal());

        number.clear();
        System.out.println("Clear Linked List = " + number.traversal());

    }

}
