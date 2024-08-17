import java.util.Scanner;

public class Queue_Main {

    public static void main(String[] args) {
        int size, choice, element;
        queue_class obj = new queue_class();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Size: ");
        size = in.nextInt();
        obj.create_queue(size);

        do {
            System.out.println("\n========Queue Menu========");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter The Element To Enqueue: ");
                    element = in.nextInt();
                    obj.enqueue(element);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.print_queue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

    }

}
