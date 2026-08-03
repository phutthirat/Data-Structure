public class QueueTest {
    static void main() {
        //QueueArrayBased q = new QueueArrayBased();
        QueueLinkedList q = new QueueLinkedList();
        //add element 10,11,12
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);

        //peek
        System.out.println(q.peek());
        //dequeue
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
