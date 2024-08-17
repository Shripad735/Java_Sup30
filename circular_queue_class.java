public class circular_queue_class {
    int queue[], front, rear, MaxSize, count;

    void create_queue(int size) {
        queue = new int[size];
        front = rear = -1;
        MaxSize = size;
        count = 0;
    }

    Boolean is_full() {
        if (count == MaxSize) {
            return true;
        } else {
            return false;
        }
    }

    Boolean is_empty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int e) {
        if (is_full()) {
            System.out.println("Queue Is Already Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % MaxSize;
        queue[rear] = e;
        count++;
        System.out.println("Element " + e + " Enqueued to Queue");
    }

    void dequeue() {
        if (is_empty()) {
            System.out.println("Queue Is Already Empty");
            return;
        }
        System.out.println("Element " + queue[front] + " Dequeued from Queue");
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MaxSize;
        }
        count--;
    }

    void print_queue() {
        if (is_empty()) {
            System.out.println("Queue Is Empty");
            return;
        }
        System.out.println("Queue Elements:");
        int i, c;
        i = front;
        c = 0;
        while (c < count) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % MaxSize;
            c++;
        }
    }
}
