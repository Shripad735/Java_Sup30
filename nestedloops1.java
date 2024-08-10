public class nestedloops1 {
    public static void main(String[] args) {
        System.out.println("X");
        for(int space=0,i=4;space<=3 || i<=4; space++,i++)
        {
            System.out.print("X");
            for(int s = 1 ; s<=space ;s++){
                System.out.print(" ");
            }
            System.out.print("X");

            System.out.println();
        }
        System.out.println("XXXXXX");

    }
    
}
