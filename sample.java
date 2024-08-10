import java.util.Scanner;

public class sample
{
    public static void main(String []args)
    {
        System.out.println("My First Java Program.");
        // int x = 10 , y = -1 , z = 0,a;
        // a = --y * x++ % ++z;
        // System.out.println("a = " + a);
        int a,b;
        a = 10;
        b = 20;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = " + a + " b = " + b);
        Scanner sc = new Scanner(System.in);
        // System.err.println("enter the number");
        // int n = sc.nextInt();
        // System.out.println("n = " + n);
        // int result = n % 2 == 0 ? 1 : 0;
        // System.out.println(result == 1 ? "Even" : "Odd");
        // int leap = 2020;
        // if(leap % 4 == 0 && leap % 100 != 0 || leap % 400 == 0)
        // {
        //     System.out.println("Leap Year");
        // }
        // else
        // {
        //     System.out.println("Not a Leap Year");
        // }
        // int k,o;
        // System.err.println("Enter the number");
        // k = sc.nextInt();
        // System.err.println("Enter the number");
        // o = sc.nextInt();
        // if(k>o)
        // {
        //     for (int i = k ; i >= o ; i--)
        //     {
        //         System.out.println(i);
        //     }
        // }
        // else
        // {
        //     for(int i = k ; i <= o ; i++)
        //     {
        //         System.out.println(i);
        //     }
        // }

        // for(int i = 1 ; i<=50;i++)
        // {
        //     if(i%3==0 && i%5==0)
        //     {
        //         System.err.println("i = " + i);
        //     }
        // }


        //on exit generate bill
        // 1. Chai = 10 , Coffee = 15 , Bun Maska = 20
        int chai1 = 0, coffee1 = 0, bun1 = 0;
        int chaiRevenue = 0, coffeeRevenue = 0, bunRevenue = 0;
        int bill = 0;
        int choice;
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
                //print billing table in proper well aligned tabular format 
                System.out.println("Item\t\tQuantity\t\tPrice");
                System.out.println("Chai\t\t" + chai1 + "\t\t" + chaiRevenue);
                System.out.println("Coffee\t\t" + coffee1 + "\t\t" + coffeeRevenue);
                System.out.println("Bun Maska\t" + bun1 + "\t\t" + bunRevenue);
                System.out.println("Total Bill = " + bill);
                System.out.println("Thank you for visiting");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        }while(choice != 4);
    }
}