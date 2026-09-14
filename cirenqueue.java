class queue
{
    void traverse(int queue[],int rear,int front)
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Rear ="+rear);
        while(rear>=0)
        {
            System.out.println(queue[rear]);
            rear--;
        }
        System.out.println("Front ="+front);
    }
    void enqueue(int queue[],int front,int rear,int element)
    {
        int size=queue.length;
        if(rear==size-1 && front!=-1)
        {
                System.out.println("Queue is  full ");
        }
        else
{
        rear++;
        queue[rear]=element;
}
if(rear==size-1)
{
    if(front==0)
    {
    queue[front]=element;
    }
}


    }
}
class cirenqueue
{
    public static void main(String str[])
    {
        queue o1=new queue();
        int queue[]=new int[5];
        queue[1]=20;
        queue[2]=30;
        queue[3]=40;
        System.out.println("Before cicular enqueue:");
        o1.traverse(queue,3,0);
        o1.enqueue(queue,0,3,100);
         System.out.println("After cicular enqueue:");
        o1.traverse(queue,4,0);
    }
}