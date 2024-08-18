import java.util.Scanner;

public class Linear_Link_List {
    Node root;
    void insert_left(int data) {
        Node new_node = new Node(data);
        if (root == null) {
            root = new_node;
        } else {
            new_node.next = root;
            root = new_node;
        }
        System.out.println("Inserted " + data + " to the left");
    }
    void delete_left() {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            Node temp = root;
            root = root.next;
            System.out.println("Deleted " + temp.data + " from the left");
        }
    }
    void insert_right(int data) {
        Node new_node = new Node(data);
        if (root == null) {
            root = new_node;
        } else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        System.out.println("Inserted " + data + " to the right");
    }

    void delete_right() {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            Node temp = root;
            Node prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == root) {
                root = null;
            } else {
                prev.next = null;
            }
            System.out.println("Deleted " + temp.data + " from the right");
        }
    }
    void display() {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            Node temp = root;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void search_list(int data) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            Node temp = root;
            int pos = 1;
            while (temp != null) {
                if (temp.data == data) {
                    System.out.println(data + " found at position " + pos);
                    return;
                }
                temp = temp.next;
                pos++;
            }
            System.out.println(data + " not found in the list");
        }
    }

    public static void main(String[] args) {
        Linear_Link_List ll = new Linear_Link_List();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("============Menu===========");
            System.out.println("1. Insert left");
            System.out.println("2. Delete left");
            System.out.println("3. Insert right");
            System.out.println("4. Delete right");
            System.out.println("5. Display");
            System.out.println("6. Search");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    ll.insert_left(sc.nextInt());
                    break;
                case 2:
                    ll.delete_left();
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    ll.insert_right(sc.nextInt());
                    break;
                case 4:
                    ll.delete_right();
                    break;
                case 5:
                    ll.display();
                    break;
                case 6:
                    System.out.print("Enter data to search: ");
                    ll.search_list(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);
    }
}
           