public class patternmix1 {
    public static void main(String[] args) {
        char a , b;
        int space;
        for(space=5,a='1',b='A';space>=1 && a>='E';space--,a++,b++)
        {
            for(int s = 1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for(char j = '1';j<=a;j++)
            {
                System.out.print(j);
            }
            for(char k = 'A';k<=b;k++)
            {
                System.out.print(k);
            };
            System.out.println();
        }
    }
    
}

