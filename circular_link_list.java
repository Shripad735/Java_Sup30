import java.util.Scanner;

public class circular_link_list {
    Node root;
    Node last;
    void create() {
        root = last = null;
    }
    void insert_left(int data) {
        Node new_node = new Node(data);
        if (root == null) {
            root = last = new_node;
            last.next = root;
        } else {
            new_node.next = root;
            last.next = new_node;
            root = new_node;
        }
        System.out.println("Inserted " + data + " to the left");
    }
    void delete_left() {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Deleted " + root.data + " from the left");
            if (root == last) {
                root = last = null;
            } else {
                last.next = root.next;
                root = root.next;
            }
        }
    }
    void insert_right(int data) {
        Node new_node = new Node(data);
        if (root == null) {
            root = last = new_node;
            last.next = root;
        } else {
            last.next = new_node;
            new_node.next = root;
            last = new_node;
        }
        System.out.println("Inserted " + data + " to the right");
    }

    void delete_right() {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Deleted " + last.data + " from the right");
            if (root == last) {
                root = last = null;
            } else {
                Node temp = root;
                while (temp.next != last) {
                    temp = temp.next;
                }
                temp.next = root;
                last = temp;
            }
        }
    }

    void display() {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            Node temp = root;
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != root);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice;
        circular_link_list list = new circular_link_list();
        list.create();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Insert left");
            System.out.println("2. Delete left");
            System.out.println("3. Insert right");
            System.out.println("4. Delete right");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    list.insert_left(data);
                    break;
                case 2:
                    list.delete_left();
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insert_right(data);
                    break;
                case 4:
                    list.delete_right();
                    break;
                case 5:
                    list.display();
                    break;
            }
        } while (choice != 6);
    }    
}
