class queue
{

void traverse(int queue[], int rear, int front)
{
    if(front == -1)
    {
        System.out.println("Queue is empty");
        return;
    }

    int i=rear;

    while(true)
    {
        System.out.println(queue[i]);

        if(i==front)
        {
            break;
        }

        if(i== 0)
        {
            i= queue.length - 1;
        }
        else
        {
           i = i - 1;
        }
    }

    System.out.println("Front = " + front);
    System.out.println("Rear = " + rear);
}

boolean isFull(int queue[], int rear, int max)
    {
       
        if(rear==max)
        {
            System.out.println("Queue is Full");
            return true;
        }
        else
        {
            System.out.println("Queue is not Full");
            return false;
        }
    }
}
class isfullcir
{
    public static void main(String str[])
{

    queue o1=new queue();
    int queue[]={102,201,305,732};
    int rear=3;
    int front=0;
    System.out.println("Traversing the queue:");
  o1.traverse(queue,rear,front);
System.out.println("ISfull opearation:");
System.out.println(o1.isFull(queue,rear,10));
}
}