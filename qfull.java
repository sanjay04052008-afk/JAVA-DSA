class ink
{
    void traverse(int queue[],int rear,int front)
    {
        if(rear!=-1)
        {
            System.out.println("Rear = "+ (rear));
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
        boolean isFull(int queue[],int rear,int max)
        {
            if(rear==max)
            {
                System.out.println("Queue is full");
                return true;
            }
            else
            {
                System.out.println("Queue is not full");
                return false;
            }
        }
    }
    class qfull
    {
        public static void main(String str[])
{
                int queue[]=new int[1000];
                ink O5=new ink();
                int front=0;
                int rear=4;
                queue[0]=891;
                queue[1]=561;
                queue[2]=912;
                queue[3]=210;
                queue[4]=276;
                System.out.println("Traversing the Queue:");
                O5.traverse(queue,rear,front);
                System.out.println("IsFull operation:");
                System.out.println(O5.isFull(queue,rear,10));
}
    }