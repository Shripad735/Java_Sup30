public class function_1 {
    static public void my_function() {
        System.out.println("Hello I am Function");
    }
    static public void my_function2(String name) {
        System.out.println("Hello I am Function 2 " + name);
    }
    static public int my_function3(int num) {
        System.out.print("Hello I am Function 3 ");
        return (num*num);
    }
    static public void my_function4(int num1 , int num2)
    {
        if(num1<num2)
        {
            System.out.println(num1 + " is smaller");
        }
        else if(num1>num2)
        {
            System.out.println(num2 + " is smaller");
        }
        else
        {
            System.out.println("num1 is equal to num2");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("--------------------------------------");
        my_function();
        System.out.println("--------------------------------------");
        System.out.println("Hello World");
        System.out.println("--------------------------------------");
        my_function2("Rahul");
        System.out.println("--------------------------------------");
        my_function4(4, 1);
        System.out.println("--------------------------------------");
        

    }
}

