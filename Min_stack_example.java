import java.util.Scanner;

public class Min_stack_example {
    int stack[],tos,MaxSize;

    void create_stack(int size)
    {
        stack = new int[size];
        tos = -1;
        MaxSize = size;
    }

    void Peak()
    {
        if(is_empty())
        {
            System.out.println("Stack Is Empty");
            return;
        }
        System.out.println("Element At The Top Of The Stack Is: " + stack[tos]);
    }

    void push(int e)
    {
        if(is_full())
        {
            System.out.println("Stack Is Already Full");
            return;
        }
        tos++;
        stack[tos] = e;
        System.out.println("Element " + e + " Pushed to Stack");
    }

    boolean is_full()
    {
        if(tos==MaxSize-1)
        {
            return true;
        }else{
            return false;
        }
        //return(tos==MaxSize-1)
    }

    boolean is_empty()
    {
        if(tos==-1)
        {
            return true;
        }else{
            return false;
        }
    }

    int pop()
    {
        if(is_empty())
        {
            System.out.print("Stack Is Already Empty ");
            return -1;
        }
        int temp= stack[tos];
        tos--;
        return(temp);
    }

    void print_stack()
    {
        if(is_empty())
        {
            System.out.println("Stack Is Empty");
            return;
        }
        for(int i = tos;i>-1;i--)
        {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10;
        Min_stack_example stack1 = new Min_stack_example();
        stack1.create_stack(size);
        Min_stack_example stack2 = new Min_stack_example();
        stack2.create_stack(size);

        Scanner sc = new Scanner(System.in);
        int choice;
        int element;

        do{
            System.out.println("1.Push element to stack");
            System.out.println("2.Pop element from stack");
            System.out.println("3.Print stack");
            System.out.println("4.Peek");
            System.out.println("5.Get Min Element");
            System.out.println("6.Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Element To Push: ");
                    element = sc.nextInt();
                    if (stack1.is_empty())
                    {
                        stack1.push(element);
                        stack2.push(element);
                    }
                    else
                    {
                        stack1.push(element);
                        if (element < stack2.stack[stack2.tos])
                        {
                            stack2.push(element);
                        }
                    }
                    break;
                case 2:
                    if(stack1.is_empty())
                    {
                        System.out.println("Stack Is Empty");
                    }else{
                        element = stack1.pop();
                        if (element == stack2.stack[stack2.tos])
                        {
                            stack2.pop();
                        }
                    }
                    break;
                case 3:
                    stack1.print_stack();
                    break;
                case 4:
                    stack1.Peak();
                    break;
                case 5:
                    if (stack2.is_empty())
                    {
                        System.out.println("Stack Is Empty");
                    }
                    else
                    {
                        System.out.print("Minimum Element In Stack Is: ");
                        stack2.Peak();
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=6);
    }
}
