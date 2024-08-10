import java.util.Scanner;

public class patterns_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int k = 5;
        for(int i = 1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(k+"\t");
                k--;
            }
            k=5;
            System.out.println();
        }
    }
    
}
