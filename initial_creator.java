import java.util.Scanner;

public class initial_creator {
    public static void main(String args[])
    {
        String s;
        System.out.println("Enter Your Full Name: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        int ind = s.indexOf(" ");
        System.out.println(ind);
        int ind2 = s.indexOf(" ", ind+1);
        System.out.println(ind2);

        char c1 = s.charAt(0);
        char c2 = s.charAt(ind+1);
        char c3 = s.charAt(ind2+1);

        //print in uppercase

        System.out.println(c1 + "." + c2 + "." + c3);}
}
