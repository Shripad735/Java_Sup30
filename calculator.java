import java.util.Scanner;

public class calculator {
    //show menu to 1.add 2.subtract 3.multiply 4.divide 5.exit
    //once selected read no1,no2 calls needed function and return answer
    //must use functions and float number only
    //Prompt for operation selection , Prompt for two numbers
    //Display result

    public static float add(float no1, float no2) {
        return no1 + no2;
    }
    public static float subtract(float no1,float no2){
        return no1-no2;
    }
    public static float multiply(float no1,float no2){
        return no1*no2;
    }
    public static float divide(float no1,float no2){
        return no1/no2;
    }

    public static void main(String[] args) {
        int choice;
        float no1, no2, result;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                System.out.println("Enter the first number: ");
                no1 = sc.nextFloat();
                System.out.println("Enter the second number: ");
                no2 = sc.nextFloat();
                    result = add(no1, no2);
                    break;
                case 2:
                System.out.println("Enter the first number: ");
                no1 = sc.nextFloat();
                System.out.println("Enter the second number: ");
                no2 = sc.nextFloat();
                    result = subtract(no1, no2);
                    break;
                case 3:
                System.out.println("Enter the first number: ");
                no1 = sc.nextFloat();
                System.out.println("Enter the second number: ");
                no2 = sc.nextFloat();
                    result = multiply(no1, no2);
                    break;
                case 4:
                System.out.println("Enter the first number: ");
                no1 = sc.nextFloat();
                System.out.println("Enter the second number: ");
                no2 = sc.nextFloat();
                    result = divide(no1, no2);
                    break;
                default:
                    System.out.println("Invalid choice , Please try again");
                    result = 0;
            }
            System.out.println("The result of the operation is: " + result);
        } while (choice != 5);
    }


    
}
