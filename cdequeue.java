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
    void dequeue(int queue[],int rear,int front)
    {
        if(front==-1||front>rear)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            front=front+1;
        }
    }
}
    class cdequeue
    {
        public static void main(String str[])
        {
                queue o2=new queue();
                int queue[]=new int[100];
                int rear=3;
                queue[0]=10;
                queue[1]=20;
                queue[2]=30;
                queue[3]=40;
                System.out.println("Before cicular dequeue:");
                o2.traverse(queue,rear,0);
                o2.dequeue(queue,rear,0);
                System.out.println("After cicular dequeue:");
                o2.traverse(queue,rear,1);
    }
}
        