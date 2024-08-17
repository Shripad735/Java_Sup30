import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private String gender;
    private int rollNumber;

    public Student(String name, String gender, int rollNumber) {
        this.name = name;
        this.gender = gender;
        this.rollNumber = rollNumber;
    }

    public String getName() 
    { 
        return name; 
    }

    public String getGender() 
    { 
        return gender; 
    }

    public int getRollNumber() 
    { 
        return rollNumber; 
    }

    public void setName(String name) 
    { 
        this.name = name; 
    }

    public void setGender(String gender) 
    { 
        this.gender = gender; 
    }
}

public class StudentManagementSystem {
    private static List<Student> students = new ArrayList<>();
    private static int nextRollNumber = 1001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register new student");
            System.out.println("2. Search student");
            System.out.println("3. Edit student information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    registerStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    editStudent(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student gender: ");
        String gender = scanner.nextLine();

        int rollNumber = nextRollNumber++;
        Student student = new Student(name, gender, rollNumber);
        students.add(student);

        System.out.println("Student Registration Successful!");
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Roll Number: " + rollNumber);
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter roll number to search: ");
        int rollNumber = scanner.nextInt();

        Student student = findStudentByRollNumber(rollNumber);
        if (student != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
        } else {
            System.out.println("Student Not Found");
        }
    }

    private static void editStudent(Scanner scanner) {
        System.out.print("Enter roll number to edit: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); 

        Student student = findStudentByRollNumber(rollNumber);
        if (student != null) {
            System.out.println("1. Update name");
            System.out.println("2. Update gender");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    student.setName(newName);
                    System.out.println("Name updated successfully");
                    break;
                case 2:
                    System.out.print("Enter new gender: ");
                    String newGender = scanner.nextLine();
                    student.setGender(newGender);
                    System.out.println("Gender updated successfully");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Student Not Found");
        }
    }

    private static Student findStudentByRollNumber(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}