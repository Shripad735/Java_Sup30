public class stack_class {
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
    }
    
}