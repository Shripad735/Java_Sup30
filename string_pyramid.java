public class string_pyramid {
    public static void main(String args[])
    {
        String word = "Alchemist";
        System.out.println("Original Word: "+word);

        for(int i=0;i<word.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }


    }
    
}
