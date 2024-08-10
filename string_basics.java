public class string_basics {

    public static void main(String args[])
    {
        String s = "this is 007 !@#$%";
        for(int i = 0;i<s.length();i++)
        {
            System.out.println(i + " @ " + s.charAt(i) + " @ " + (int)s.charAt(i));
        }
    }

}
    
