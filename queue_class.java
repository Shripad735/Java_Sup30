public class queue_class {
    int queue[],front,rear,MaxSize;

    void create_queue(int size)
    {
        queue = new int[size];
        front = rear = -1;
        MaxSize = size;
    }

    Boolean is_full()
    {
        if(rear==MaxSize-1)
        {
            return true;
        }else{
            return false;
        }
    }

    Boolean is_empty()
    {
        if(front==-1)
        {
            return true;
        }else{
            return false;
        }
    }

    void enqueue(int e)
    {
        if(is_full())
        {
            System.out.println("Queue Is Already Full");
            return;
        }
        if(front==-1)
        {
            front = 0;
        }
        rear++;
        queue[rear] = e;
        System.out.println("Element " + e + " Enqueued to Queue");
    }

    void dequeue()
    {
        if(is_empty())
        {
            System.out.println("Queue Is Already Empty");
            return;
        }
        System.out.println("Element " + queue[front] + " Dequeued from Queue");
        if(front==rear)
        {
            front = rear = -1;
        }else{
            front++;
        }
    }

    void print_queue()
    {
        if(is_empty())
        {
            System.out.println("Queue Is Empty");
            return;
        }
        System.out.print("Queue: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
