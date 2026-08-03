
public class QueueArrayBased {

    // attributes in Queue Array-Based
    private int[] queue;
    private final int MAX_SIZE = 50;
    private int size;

    // create an empty queue with default capacity
    public QueueArrayBased() {
        queue = new int[MAX_SIZE];
        size = 0;  // no element in queue
    }

    // create an empty queue with a specific capacity
    public QueueArrayBased(int capacity) {
        queue = new int[capacity];
        size = 0;  // no element in queue
    }

    public boolean isEmpty() {
            return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean enqueue(int new_element) {
        if (!isFull()) {
            size++;
            queue[size-1] = new_element;
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        return (!isEmpty()) ? queue[0] : -1 ;
    }

    public int dequeue() {
        if (!isEmpty()) {
            int temp = queue[0];
            for (int i = 1; i < size; i++) {
                queue[i - 1] = queue[i];
            }
            size--;
            return temp;
        } else {
            return -1;
        }
    }
}







