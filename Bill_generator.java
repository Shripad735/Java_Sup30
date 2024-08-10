import java.util.Scanner;

//create a system to take orders
// iteams are tea = 10 , coffee = 20 , samosa = 15 , vada = 10 , dosa = 30
// example : 4 2 2 1 1 means 4 tea , 2 coffee , 2 samosa , 1 vada , 1 dosa
// generate proper bill in tabular form in the end everything should be well aligned
// item           cost/unit        quantity           total
// tea            10              4                  40
// coffee         20              2                  40
// samosa         15              2                  30
// vada           10              1                  10
// dosa           30              1                  30
//---------------------------------------------------------
// grand total = 150

public class Bill_generator {
    public static void main(String[] args) {

        int choice;
        int chai1 = 0, coffee1 = 0, bun1 = 0;
        int chaiRevenue = 0, coffeeRevenue = 0, bunRevenue = 0;
        int bill = 0;

        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Welcome to the menu");
        System.out.println("1. Chai = 10");
        System.out.println("2. coffee = 15");
        System.out.println("3. Bun Maska = 20");
        System.err.println("4. Exit");
        System.err.println("Enter the choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Chai selected");
                chai1++;
                chaiRevenue += 10;
                bill += 10;
                break;
            case 2:
                System.out.println("Coffee selected");
                coffee1++;
                coffeeRevenue += 15;
                bill += 15;
                break;
            case 3:
                System.out.println("Bun Maska selected");
                bun1++;
                bunRevenue += 20;
                bill += 20;
                break;
            case 4:
                System.out.println("Exit");
                System.out.println("item           cost/unit        quantity           total");
                System.out.println("tea            10              "+chai1+"                  "+chaiRevenue);
                System.out.println("coffee         15              "+coffee1+"                  "+coffeeRevenue);
                System.out.println("Bun Maska      20              "+bun1+"                  "+bunRevenue);
                System.out.println("---------------------------------------------------------");
                System.out.println("grand total = "+bill);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        }while(choice!=4);        
    }
}
