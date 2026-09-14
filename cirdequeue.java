class pencil
{
    void traverse(int queue[],int rear,int front)
    {
        if(rear!=-1)
        {
            System.out.println("Rear ="+ (rear));
        }
        while(rear>=front)
        {
            
            System.out.println(queue[rear]);
            rear=rear-1;
            
        }
         if(front!=-1)
            {

            System.out.println("Front =  "+(front));
        }
    }
    void dequeue(int queue[], int rear, int front)
{
    int size = queue.length;

    if (front == -1)
    {
        System.out.println("Queue is empty");
    }
    else
    {
        System.out.println("Deleted = " + queue[front]);

        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            if (front == size - 1)
            {
                front = 0;
            }
            else
            {
                front++;
            }
        }
    }
}
       
}
class cirdequeue
{
    public static void main(String str[])
    {
        int queue[]=new int[1000];
        pencil O1=new  pencil();
        int rear=4;
        int front=0;
        queue[0]=111;
        queue[1]=234;
        queue[2]=456;
        queue[3]=980;
        queue[4]=750;
        System.out.println("Before dequeue operation: "); 
        O1.traverse(queue,rear,front);
        O1.dequeue(queue,rear,front);
        front=front+1;
        System.out.println("After dequeue operation:");
        O1.traverse(queue,rear,front);
    }
}