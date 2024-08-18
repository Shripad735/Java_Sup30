import java.util.LinkedList;
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

    void delete_element(int data) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            Node temp = root;
            Node prev = null;
            while (temp != null) {
                if (temp.data == data) {
                    if (temp == root) {
                        root = root.next;
                    } else {
                        prev.next = temp.next;
                    }
                    System.out.println("Deleted " + data + " from the list");
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
            System.out.println(data + " not found in the list");
        }
    }

    void insert_at_pos(int data, int pos) {
        Node new_node = new Node(data);
        if (pos == 1) {
            new_node.next = root;
            root = new_node;
            System.out.println("Inserted " + data + " at position " + pos);
            return;
        }
        Node temp = root;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
        } else {
            new_node.next = temp.next;
            temp.next = new_node;
            System.out.println("Inserted " + data + " at position " + pos);
        }
    }

    void length() {
        Node temp = root;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Length of the list is " + count);
    }

    void sort_list() {
        Node i, j;
        int temp;
        for (i = root; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        System.out.println("List sorted successfully");
        display();
    }

    void count_duplicate() {
        Node i, j;
        int count = 0;
        String dup_words[] = new String[100];
        for (i = root; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.data == j.data) {
                    count++;
                    int flag = 0;
                    for (int k = 1; k <= count; k++) {
                        if (dup_words[k] == String.valueOf(i.data)) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        dup_words[count] = String.valueOf(i.data);
                    }        
                }
            }
        }
        System.out.println("Number of duplicates in the list is " + count);
        System.out.println("Duplicates are: ");
        for (int k = 1; k <= count; k++) {
            System.out.print(dup_words[k] + " ");
        }
    }

    void remove_duplicates(LinkedList new_ll) {
        Node temp = root;
        while (temp != null) {
            if (!new_ll.contains(temp.data)) {
                new_ll.add(temp.data);
            }
            temp = temp.next;
        }
        System.out.println("List with duplicates removed: ");
        System.out.println(new_ll);
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
            System.out.println("7. Delete element");
            System.out.println("8. Insert at position");
            System.out.println("9. Length");
            System.out.println("10. Sort");
            System.out.println("11. Count duplicates");
            System.out.println("12. Remove duplicates");
            System.out.println("13. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert: ");
                    int data = sc.nextInt();
                    ll.insert_left(data);
                    break;
                case 2:
                    ll.delete_left();
                    break;
                case 3:
                    System.out.println("Enter the element to insert: ");
                    data = sc.nextInt();
                    ll.insert_right(data);
                    break;
                case 4:
                    ll.delete_right();
                    break;
                case 5:
                    ll.display();
                    break;
                case 6:
                    System.out.println("Enter the element to search: ");
                    data = sc.nextInt();
                    ll.search_list(data);
                    break;
                case 7:
                    System.out.println("Enter the element to delete: ");
                    data = sc.nextInt();
                    ll.delete_element(data);
                    break;
                case 8:
                    System.out.println("Enter the element to insert: ");
                    data = sc.nextInt();
                    System.out.println("Enter the position: ");
                    int pos = sc.nextInt();
                    ll.insert_at_pos(data, pos);
                    break;
                case 9:
                    ll.length();
                    break;
                case 10:
                    ll.sort_list();
                    break;
                case 11:
                    ll.count_duplicate();
                    break;
                case 12:
                    LinkedList<Integer> new_ll = new LinkedList<>();
                    ll.remove_duplicates(new_ll);
                    break;
                case 13:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 13);
    }
}