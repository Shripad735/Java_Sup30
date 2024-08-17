import java.util.Scanner;

public class balaneced_parenthasis_checker {
    char stack[];
    int tos,MaxSize;
    void create_stack(int size)
    {
        stack = new char[size];
        tos = -1;
        MaxSize = size;
    }
    void push(char e)
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
    char pop()
    {
        if(is_empty())
        {
            System.out.print("Stack Is Already Empty ");
            return ' ';
        }
        return stack[tos--];
    }

    public static void main(String[] args) {
        balaneced_parenthasis_checker obj = new balaneced_parenthasis_checker();
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The String: ");
        str = in.nextLine();
        obj.create_stack(str.length());
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                obj.push(str.charAt(i));
            }
            else if(str.charAt(i)==')')
            {
                if(obj.is_empty())
                {
                    System.out.println("Not Balanced");
                    return;
                }
                obj.pop();
            }
        }
        if(obj.is_empty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
    
}
