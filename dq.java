class que
{
    void traverse(int queue[],int rear,int front)
    {
        if(front>=0)
        {
            System.out.println(queue[rear]);
            rear=rear-1;
        }
        else
        {
            System.out.println("Queue underflow");
        }
    }
    void dequeue(int queue[],int front,int data)
    {
        if(front==-1)
        {
            System.out.println("Queue underflow");
        
        }
        else
        {
            data=queue[front];
            front=front+1;
        }
    }
    
}
class dq
{
    public static void main(String str[])
    {
        que o6=new que();
        int queue[]=new int[150];
        queue[3]=40;
        queue[2]=30;
        queue[1]=20;
        queue[0]=10;
        System.out.println(" Before enqueue:");
        o6.traverse(queue,3,0);
        o6.dequeue(queue,0,10);
        System.out.println("After enqueue:");
         o6.traverse(queue,2,0);
    }
}