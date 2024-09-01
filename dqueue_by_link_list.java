import java.util.Scanner;
import java.util.LinkedList;
public class dqueue_by_link_list {
    static void insertFront(LinkedList<Integer> list, int x) {
        list.addFirst(x);
    }
    static void insertRear(LinkedList<Integer> list, int x) {
        list.addLast(x);
    }
    static void deleteFront(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            list.removeFirst();
            System.out.println("Element deleted");
        }
    }
    static void deleteRear(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            list.removeLast();
            System.out.println("Element deleted");
        }
    }
    static void display(LinkedList<Integer> list) {
        System.out.println("Front: " + list.peekFirst());
        System.out.println("Rear: " + list.peekLast());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        while (true) {
            System.out.println("1. Left to Right Implementation");
            System.out.println("2. Right to Left Implementation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1: {
                    while (true) {
                        System.out.println("Insert Front: 1");
                        System.out.println("Delete Rear: 2");
                        System.out.println("Display: 3");
                        System.out.println("Exit: 4");
                        System.out.print("Enter your choice: ");
                        int ch = sc.nextInt();
                        switch (ch) {
                            case 1: {
                                System.out.print("Enter the element: ");
                                int x = sc.nextInt();
                                insertFront(list, x);
                                break;
                            }
                            case 2: {
                                deleteRear(list);
                                break;
                            }
                            case 3: {
                                display(list);
                                break;
                            }
                            case 4: {
                                System.exit(0);
                            }
                            default: {
                                System.out.println("Invalid choice");
                            }
                        }
                    }
                }
                case 2: {
                    while (true) {
                        System.out.println("Insert Rear: 1");
                        System.out.println("Delete Front: 2");
                        System.out.println("Display: 3");
                        System.out.println("Exit: 4");
                        System.out.print("Enter your choice: ");
                        int ch = sc.nextInt();
                        switch (ch) {
                            case 1: {
                                System.out.print("Enter the element: ");
                                int x = sc.nextInt();
                                insertRear(list, x);
                                break;
                            }
                            case 2: {
                                deleteFront(list);
                                break;
                            }
                            case 3: {
                                display(list);
                                break;
                            }
                            case 4: {
                                System.exit(0);
                            }
                            default: {
                                System.out.println("Invalid choice");
                            }
                        }
                    }
                }
                case 3: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}

