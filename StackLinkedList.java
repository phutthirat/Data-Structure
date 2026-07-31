

public class StackLinkedList {
   
   // pointer to the top node
   private Node top;

   // create an empty stack
   public StackLinkedList() {
      top = null;
   }
   
   public boolean isEmpty() {
	   return top == null;
   }
   
   public void push(int value) {
	   Node new_node = new Node(value);
	   if (isEmpty()) {
		   top = new_node;
	   } else {
		   top.next = new_node;
		   top = new_node;
	   }
   }
   
   public int peek() {
	   if (isEmpty()) {
		   return -1;
	   }
	   return top.data;
   }
   
   public int pop() {
	   if (!isEmpty()) {
		   Node temp_node = top;
		   int temp_data = temp_node.data;
		   top  = top.next;
		   temp_node = null;
		   return temp_data;
	   }
	   return -1;
   }
   

}
