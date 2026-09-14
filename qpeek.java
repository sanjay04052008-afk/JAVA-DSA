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
        void peek(int queue[],int rear)
        {
            if(rear==-1)
            {
                System.out.println("Queue underflow");
            }
            else
            {
                System.out.println(queue[rear]);
            }
        }
    }
        class qpeek
        {
            public static void main(String str[])
            {
                int queue[]=new int[1000];
                queue o7=new queue();
                queue[0]=123;
                queue[1]=124;
                queue[2]=321;
                queue[3]=567;
                System.out.println("Before peek");
                o7.traverse(queue,3,0);
                System.out.println("After peek");
                o7.peek(queue,3);
                
            }
        }