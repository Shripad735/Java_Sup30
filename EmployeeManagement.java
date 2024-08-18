import java.util.concurrent.atomic.AtomicInteger;
import java.util.Scanner;

public class EmployeeManagement {
    // Create Employee Management System using Linked List(Linear)
    // Details kept in a node are name,salary,gender,emp_id(key)
    // Code should give menu driven options for
    // 1.Register employee
    // 2.Search Employee(on id)
    // 3.Print List of Employee(only male and then only female)
    // 4.delete Employee on id(search if found then delete else error shown)
    // 5.Update Employee(read id,if found ask user to fill details
    // name,gender,salary)
    // 6.Exit

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    class Node {
        String name;
        double salary;
        char gender;
        int emp_id = ID_GENERATOR.getAndIncrement();
        Node next;

        Node(int emp_id, String name, double salary, char gender) {
            this.emp_id = emp_id;
            this.name = name;
            this.salary = salary;
            this.gender = gender;
            this.next = null;
        }
    }

    Node root = null;

    public void register_employee(String name, double salary , char gender ) {
        Node newNode = new Node(ID_GENERATOR.getAndIncrement() , name, salary , gender);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void search_employee(int emp_id) {
        Node temp = root;
        while (temp != null) {
            if (temp.emp_id == emp_id) {
                System.out.println("Employee ID: " + temp.emp_id);
                System.out.println("Employee Name: " + temp.name);
                System.out.println("Employee Salary: " + temp.salary);
                System.out.println("Employee gender: " + temp.gender);
                return;
            } else {
                temp = temp.next;
            }
        }
        System.out.println("Employee not found");
    }   

    public void print_employee() {
        Node temp = root;
        while (temp != null) {
            if ( temp.gender == 'M' ) {
                System.out.println("Employee ID: " + temp.emp_id);
                System.out.println("Employee Name: " + temp.name);
                System.out.println("Employee Salary: " + temp.salary);
                System.out.println("Employee gender: " + temp.gender);
                System.out.println("=====================================");
            }
            temp = temp.next;
        }
        temp = root;
        while (temp != null) {
            if ( temp.gender == 'F' ) {
                System.out.println("Employee ID: " + temp.emp_id);
                System.out.println("Employee Name: " + temp.name);
                System.out.println("Employee Salary: " + temp.salary);
                System.out.println("Employee gender: " + temp.gender);
                System.out.println("=====================================");

            }
            temp = temp.next;
        }
    }

    public void delete_employee(int emp_id) {
        Node temp = root;
        Node prev = null;
        while (temp != null) {
            if (temp.emp_id == emp_id) {
                if (prev == null) {
                    root = temp.next;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Employee deleted successfully");
                return;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        System.out.println("Employee not found");
    }

    public void update_employee(int emp_id) {
        Node temp = root;
        while (temp != null) {
            if (temp.emp_id == emp_id) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Employee Name: ");
                temp.name = sc.nextLine();
                System.out.println("Enter Employee Salary: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid salary: ");
                    sc.next();
                }
                temp.salary = sc.nextDouble();
                sc.nextLine(); // clear the buffer
                System.out.println("Enter Employee gender: ");
                temp.gender = sc.next().charAt(0);
                return;
            } else {
                temp = temp.next;
            }
        }
        System.out.println("Employee not found");
    }

    public static void main(String[] args) {
        EmployeeManagement obj = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Register employee");
            System.out.println("2.Search Employee(on id)");
            System.out.println("3.Print List of Employee");
            System.out.println("4.delete Employee on id");
            System.out.println("5.Update Employee");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid choice: ");
                sc.next();
            }
            int choice = sc.nextInt();
            sc.nextLine(); // clear the buffer
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Employee Salary: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid salary: ");
                        sc.next();
                    }
                    double salary = sc.nextDouble();
                    sc.nextLine(); // clear the buffer
                    System.out.println("Enter Employee Gender: ");
                    char gender = sc.next().charAt(0);
                    obj.register_employee(name, salary, gender);
                    break;
                case 2:
                    System.out.println("Enter Employee ID: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid ID: ");
                        sc.next();
                    }
                    int emp_id = sc.nextInt();
                    obj.search_employee(emp_id);
                    break;
                case 3:
                    obj.print_employee();
                    break;
                case 4:
                    System.out.println("Enter Employee ID: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid ID: ");
                        sc.next();
                    }
                    emp_id = sc.nextInt();
                    obj.delete_employee(emp_id);
                    break;
                case 5:
                    System.out.println("Enter Employee ID: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid ID: ");
                        sc.next();
                    }
                    emp_id = sc.nextInt();
                    obj.update_employee(emp_id);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (true);
    }
}