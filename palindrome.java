import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n>0)
        {
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
