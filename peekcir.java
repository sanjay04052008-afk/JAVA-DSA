class boe
{
    void traverse(int queue[],int rear,int front)
    {
        if(rear!=-1)
        {
            System.out.println("Rear ="+rear);

        }
        while(rear>=front)
        {
            System.out.println(queue[rear]);
            rear=rear+1;
        }
        if(front!=-1)
        {
            System.out.println("Front ="+front);
        }
    }
    void peek(int queue[],int rear)
}