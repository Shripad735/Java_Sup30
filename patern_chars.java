import java.util.Scanner;;

public class patern_chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char first = sc.next().charAt(0);
        System.out.print("Enter a character: ");
        char sec = sc.next().charAt(0);

        for(char i = first;i<=sec;i++)
        {
            for(char j = first;j<=i;j++)
            {
                System.out.print(j + "\t");
            }
            System.out.println();
        }



        
    }
    
}
