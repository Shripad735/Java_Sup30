public class nestedloops2 {
    public static void main(String[] args) {
        for(int space=1,i=1;space<=4 || i<=4;space++,i++)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        for(int space=3,i=3;space>=1 || i>=1;space--,i--)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        for(int space=1,i=1;space<=4 || i<=4;space++,i++)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        for(int space=3,i=3;space>=1 || i>=1;space--,i--)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    
}
