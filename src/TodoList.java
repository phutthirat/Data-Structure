
public class TodoList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DoublyLinkedList todoList = new DoublyLinkedList();

        todoList.insert("Finish Homework");
        System.out.println("To-Do-List = "+todoList.traversal());

        todoList.insert("Laundry");
        todoList.insert("Group Meeting");
        System.out.println("To-Do-List = "+todoList.traversal());

        //Exercise 2
        todoList.insert(0,"Submit Report");
        System.out.println("To-Do-List = "+todoList.traversal());

        todoList.insert(2,"Buy Food");
        System.out.println("To-Do-List = "+todoList.traversal());

        todoList.insert("Go to Gym");
        System.out.println("To-Do-List = "+todoList.traversal());

        todoList.remove();

        todoList.remove(3);

        todoList.remove(0);
        System.out.println("To-Do-List = "+todoList.traversal());

        System.out.println("Backward Traversal = " + todoList.backwardTraversal());
    }

}