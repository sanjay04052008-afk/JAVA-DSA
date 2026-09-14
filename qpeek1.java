class book
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
        void peek(int queue[],int rear)
        {
            if(rear==-1)
            {
                System.out.println("Queue underflow");
            }
            else
            {
                System.out.println("peek element:" + queue[rear]);
            }
        }
    }
        class qpeek1
        {
            public static void main(String str[])
            {
                int queue[]=new int[1000];
                book O2=new book();
                int front=0;
                int rear=3;
                queue[0]=123;
                queue[1]=786;
                queue[2]=525;
                queue[3]=990;
                System.out.println("Traversing the Queue:");
                O2.traverse(queue,rear,front);
                O2.peek(queue,rear);
                
            }
        }