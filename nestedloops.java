//controller 1st loop
//printer 2nd loop

public class nestedloops {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++)//controller
        // {
        //     for(int j = 1;j<=i;j++)//printer
        //     {
        //         System.out.print("X ");                
        //     }
        //     System.out.println();
        // }

        for(int space = 5,i=1;space>=1 && i<=5;space--,i++)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.err.print(" X");
            }
            System.err.println();
        }
        for(int space = 2,i=4;space<=5 && i>=1;space++,i--)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.err.print(" X");
            }
            System.err.println();
        }
    }    
}
