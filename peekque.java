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
 void peek(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Peek element = " + queue[front]);
        }
    }
}
    class peekque
    {
        public static void main(String str[])
        {
            queue o3=new queue();
            int queue[]={101,203,431,987}; 
            System.out.println("Peek operation:");
            o3.peek(queue,3,0);

        }
    }