public class title_case {
    public static void main(String args[])
    {
        String line = "I am a student";
        String word_list[] = line.split(" ");
        System.out.println("Original Line: "+line);
        System.out.print("Title Case Line: ");

        for(int i=0;i<word_list.length;i++)
        {
            String word = word_list[i];
            char first_letter = word.charAt(0);
            char upper_case = Character.toUpperCase(first_letter);
            String rest_word = word.substring(1);
            String title_case = upper_case + rest_word;
            System.out.print(title_case+" ");
        }
}
}