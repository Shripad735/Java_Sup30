public class word_count {
    public static void main(String args[])
    {
        String line=" this was it  it was this done all this";
        //count freuency of each word
        int count;
        String words[]=line.split(" ");
        String u_words="";
        for(int i=0;i<words.length;i++)
        {
            if(!u_words.contains(words[i]))
            {
                u_words+=" "+words[i];
            }
        }
        System.out.println(u_words);

        String u_word_list[]=u_words.split(" ");

        for(int i=0;i<u_word_list.length;i++) {
            count = 0;
            for (int j = 0; j < words.length; j++) {
                if (u_word_list[i].equals(words[j]))
                    count++;
            }

            System.out.println(u_word_list[i] + " : " + count);
        }
        }
    }