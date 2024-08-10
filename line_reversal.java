public class line_reversal {
    public static void main(String args[])
    {
       String line = "I am a student";
       String word_list[] = line.split(" ");
       System.out.println("Original Line: "+line);
       System.out.print("Reversed Line: ");
         for(int i=word_list.length-1;i>=0;i--)
         {
              System.out.print(word_list[i]+" ");
         }
    }
    
}
