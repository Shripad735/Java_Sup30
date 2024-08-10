public class funtions_with_Vargs {
    //variable size parameter is n sized array that can store all given data
    static void n_pass(int ...args)
    {
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Arguments are: ");
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
            // sum+=args[i];
        }
    }

    static int n_average(int ...args)
    {
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Arguments are: ");
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
            //System.out.println(args[i]);
            sum+=args[i];
        }
        System.out.println("Average is: " + (sum/args.length));
        return (sum/args.length);
    }

    public static void main(String[] args) {
        //read n values from main , calculate average and print only element lesser than average
        int avg = n_average(1,2,3,4,5,6,7,8,9,10);
        n_pass(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Elements lesser than average are: ");
        for(int i=0;i<10;i++)
        {
            if(i<avg)
            {
                System.out.print(" " + i);
            }
        }


    }
    
}
