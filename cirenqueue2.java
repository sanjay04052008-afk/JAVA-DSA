class queue
{
    void traverse(int queue[],int rear,int front)
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }

     
        while(rear>=front)
        {
            System.out.println(queue[rear]);
            rear--;
        }

        System.out.println(queue[0]);

        System.out.println("Front ="+front);
    }

    void enqueue(int queue[],int front,int rear,int element)
    {
        int size=queue.length;

        if(rear==size-2)
        {
            rear=-1;
        }

        rear++;
        queue[rear]=element;
    }
}

class cirenqueue2
{
    public static void main(String str[])
    {
        queue o1=new queue();

        int queue[]=new int[6];

        queue[1]=10;
        queue[2]=20;
        queue[3]=30;
        queue[4]=40;

        System.out.println("Before circular enqueue:");
        System.out.println("Rear ="+0);

        o1.traverse(queue,4,1);

        o1.enqueue(queue,1,4,500);

        System.out.println("After circular enqueue:");

        o1.traverse(queue,4,1);

        System.out.println("Rear =0");
    }
}