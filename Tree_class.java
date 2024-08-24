import java.util.Scanner;

class Tnode {
    int data;
    Tnode left, right;

    Tnode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Tree_class {

    Tnode root;

    void create_Tree() {
        root = null;
    }

    void insert(Tnode r, Tnode n) {
        if (root == null) {
            root = n;
        } else {
            if (n.data < r.data) {
                if (r.left == null) {
                    r.left = n;
                } else {
                    insert(r.left, n);
                }
            } else {
                if (r.right == null) {
                    r.right = n;
                } else {
                    insert(r.right, n);
                }
            }
        }
    }

    void inorder(Tnode r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data+ ",");
            inorder(r.right);
        }
    }

    void preorder(Tnode r) {
        if (r != null) {
            System.out.print(r.data+ ",");
            preorder(r.left);
            preorder(r.right);
        }
    }

    void postorder(Tnode r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data+ ",");
        }
    }

    Tnode get_root() {
        return root;
    }

    void display(Tnode r) {
        if (r != null) {
            display(r.left);
            System.out.print(r.data+ ",");
            display(r.right);
        }
    }

    boolean search(Tnode r, int data)
    {
        if(r == null)
            return false;
        if(r.data == data)
            return true;
        if(data < r.data)
            return search(r.left, data);
        return search(r.right, data);
    }

    public static void main(String[] args) {
        int choice;
        Tree_class t = new Tree_class();
        t.create_Tree();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Insert");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = Integer.parseInt(System.console().readLine());
                    Tnode n = new Tnode(data);
                    t.insert(t.get_root(), n);
                    t.display(t.get_root());
                    System.out.println();
                    break;
                case 2:
                    t.inorder(t.get_root());
                    System.out.println();
                    break;
                case 3:
                    t.preorder(t.get_root());
                    System.out.println();
                    break;
                case 4:
                    t.postorder(t.get_root());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the data to be searched: ");
                    int search_data = Integer.parseInt(System.console().readLine());
                    if(t.search(t.get_root(), search_data))
                        System.out.println("Data found");
                    else
                        System.out.println("Data not found");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }   
}
