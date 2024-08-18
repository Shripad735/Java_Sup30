import java.util.Scanner;

public class Stack_using_Linked_List {

    Node root;

    void push(int data) {
        Node new_node = new Node(data);
        if (root == null) {
            root = new_node;
        } else {
            new_node.next = root;
            root = new_node;
        }
        System.out.println("Pushed " + data);
    }

    void pop() {
        if (root == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = root;
            root = root.next;
            System.out.println("Popped " + temp.data);
        }
    }

    void peak() {
        if (root == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peak: " + root.data);
        }
    }

    void display() {
        if (root == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = root;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int choice;
        Stack_using_Linked_List stack = new Stack_using_Linked_List();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peak");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peak();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

}
