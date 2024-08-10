import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String args[])
    {
        String s1 = "listen";
        String s2 = "silent";
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }    
}
