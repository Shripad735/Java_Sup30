import java.util.Scanner;

public class queue_using_linklist {
    Node front, rear;
    int size;

    void create () {
        front = rear = null;
        size = 0;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued " + front.data);
            front = front.next;
            size--;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice;
        queue_using_linklist queue = new queue_using_linklist();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
            }
        } while (choice != 4);
    }    
}
