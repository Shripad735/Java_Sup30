import java.util.Scanner;

public class palindromeSTR {

    public static void main(String args[])
    {
        String s;
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        int i = 0;
        int j = s.length()-1;
        boolean isPalindrome = true;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
