public class Replacing_str {
    public static void main(String args[])
    {
        String line = "this is it , it is this , done all this";
        String [] words = line.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals("it"))
            {
                count = count + 1;
            }
        }
        System.out.println("The word 'it' is repeated "+count+" times in the given line");
    }
    
}
