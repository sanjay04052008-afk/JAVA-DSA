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
        boolean isFull(int queue[],int rear,int max)
        {
            if(rear==max)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    class isfull
    {
        public static void main(String str[])
{
                int queue[]=new int[1000];
                queue o5=new queue();
                queue[0]=123;
                queue[1]=124;
                queue[2]=321;
                queue[3]=567;
                System.out.println("Queue elements:");
                o5.traverse(queue,3,0);
                System.out.println("isFull operation:");
                System.out.println(o6.isFull(queue,3,100));
}
        
        
    }