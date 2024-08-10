public class replacing_string {
    public static void main(String args[])
    {
        String poem = "her eyes , her smile , her face , her hair a captivating grace";

        System.out.println("Original Poem: "+poem);

        String new_poem = poem.replace("her","Shashi's");

        System.out.println("New Poem: "+new_poem);
    }
    
}
