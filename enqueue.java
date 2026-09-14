class queue
{
    void traverse(int queue[],int rear,int front)
    {
        if(rear!=-1)
        {
            System.out.println("Rear = "+ (rear));
        }
        while(rear>=0)
        {
            
            System.out.println(queue[rear]);
            rear=rear-1;
            
        }
         if(front!=-1)
            {

            System.out.println("Front =  "+(front));
        }
    }                 
    void enqueue(int queue[],int rear,int front,int element)
    {
        int size=queue.length;
        if(rear==size-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        if(front==-1)
        {
            front=0;
        }
        rear=rear+1;
        queue[rear]=element;
    }
}
class enqueue
{
    public static void main(String str[])
    {
        int queue[]=new int[1000];
        queue O1=new  queue();
        queue[0]=111;
        queue[1]=234;
        queue[2]=456;
        queue[3]=980;
        System.out.println("Before enqueue operation: "); 
        O1.traverse(queue,3,0);
        O1.enqueue(queue,3,0,500);
        System.out.println("After enqueue operation:");
        O1.traverse(queue,4,0);
    }
}