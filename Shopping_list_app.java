import java.util.ArrayList;
import java.util.Scanner;

public class Shopping_list_app {

    private ArrayList list;

    Shopping_list_app() {
        list = new ArrayList(); // Create an empty list
    }

    void AddItem(String item) {
        if (list.contains(item) || list.contains(item.toUpperCase()) || list.contains(item.toLowerCase())) {
            System.out.println("Item already exists");
        } else {
            list.add(item);
            System.out.println("Item added successfully");
        }
    }

    void RemoveItem(String item) {
        if (list.contains(item)) {
            list.remove(item);
            System.out.println("Item removed successfully");
        } else {
            System.out.println("Item not found");
        }
    }

    void updateItem(String oldItem) {
        if (list.contains(oldItem)) {
            displayItems();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the new item: ");
            String newItem = sc.nextLine();
            int index = list.indexOf(oldItem);
            list.set(index, newItem);
            System.out.println("Item updated successfully");
        } else {
            System.out.println("Item not found");
        }
    }

    void displayItems() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in the list are: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println();
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Shopping_list_app obj = new Shopping_list_app();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item");
            System.out.println("4. Display Items");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the item to add: ");
                    String item = sc.next();
                    obj.AddItem(item);
                    break;
                case 2:
                    System.out.println("Enter the item to remove: ");
                    String item1 = sc.next();
                    obj.RemoveItem(item1);
                    break;
                case 3:
                    System.out.println("Enter the item to update: ");
                    String item2 = sc.next();
                    obj.updateItem(item2);
                    break;
                case 4:
                    obj.displayItems();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
