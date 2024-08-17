import java.util.Scanner;

public class Stack_Main {
    public static void main(String[] args) {
        int size,choice,element;
        stack_class obj = new stack_class();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Size: ");
        size = in.nextInt();
        obj.create_stack(size);
        do{
            System.out.println("\n========Stack Menu========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println(("3. Peak"));
            System.out.println("4. Print Stack");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter The Element To Push: ");
                    element = in.nextInt();
                    obj.push(element);
                    break;
                case 2:
                    element = obj.pop();
                    if(element!=-1)
                    {
                        System.out.println("Element " + element + " Popped From Stack");
                    }
                    break;
                case 3:
                    obj.Peak();
                    break;
                case 4:
                    obj.print_stack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=5);
    }
    
}
