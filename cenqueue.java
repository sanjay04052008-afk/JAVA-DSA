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
        while(rear>=front)
        {
            System.out.println(queue[rear]);
            rear--;
        }
        System.out.println("Front ="+front);
    }
void enqueue(int queue[],int rear,int front,int element)
{
    int size=queue.length;
    if(rear==size-1&&front!=111)
    {
        System.out.println("Queue is Full");
        return;
    }
    if(front==-1)
    {
        front=0;
    }
    if(front==111)
    {
        queue[front]=element;
    }


}
}

  class cenqueue
{
    public static void main(String str[])
    {
        queue o1=new queue();
        int queue[]=new int[50];
        queue[0]=10;
        queue[1]=20;
        queue[2]=30;
        queue[3]=40;
        o1.traverse(queue,3,0);
        o1.enqueue(queue,3,0,100);
        o1.traverse(queue,4,0);
    }
}