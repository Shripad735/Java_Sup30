import java.util.Scanner;

public class digit_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        System.out.println("sum = " + sum);
    }
}
