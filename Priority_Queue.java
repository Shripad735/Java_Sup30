public class Priority_Queue
{
    int queue[],MaxSize,front,rear;

    void create_queue(int size)
    {
        queue=new int[size];
        rear=-1;
        front=0;
        MaxSize=size;
        System.out.println("Queue created of size "+size);
    }
    void enqueue(int e)
    {
        rear++;
        queue[rear]=e;
        System.out.println(e+" inserted in queue");
        for(int i=front;i<rear;i++)//passes
        {
            for(int j=front;j<rear;j++)//sort
            {
                if(queue[j]<queue[j+1])//APQ    DPQ <
                {
                    int temp=queue[j];
                    queue[j]=queue[j+1];
                    queue[j+1]=temp;
                }
            }
        }
    }
    boolean is_full()
    {
        if(rear==MaxSize-1)
            return true;
        else
            return false;

        //return(rear==MaxSize-1)
    }
    int dequeue()//removes and returns data
    {
        int temp=queue[front];
        front++;
        return(temp);
    }
    boolean is_empty()
    {
        if(front>rear)
            return true;
        else
            return false;

        //return(tos==-1)
    }
    void print_queue()
    {
        System.out.println("stack has\n");
        for(int i=front;i<=rear;i++)//FIFO
        {
            System.out.print(queue[i]+" - ");
        }
    }

    public static void main(String[] args)
    {
        int size,choice,element;
        Priority_Queue obj=new Priority_Queue();
        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.print("Enter The Size: ");
        size=in.nextInt();
        obj.create_queue(size);

        do
        {
            System.out.println("\n========Queue Menu========");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print Queue");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice=in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter The Element To Enqueue: ");
                    element=in.nextInt();
                    obj.enqueue(element);
                    break;
                case 2:
                    if(obj.is_empty())
                        System.out.println("Queue Is Already Empty");
                    else
                        System.out.println("Element "+obj.dequeue()+" Dequeued from Queue");
                    break;
                case 3:
                    obj.print_queue();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=4);
    }
}

