class note
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
        void size(int queue[],int rear,int front)
        {
            int size=rear-front+1;
            System.out.println("Size of the queue:" +size);
        }
    }
        class qsize
        {
            public static void main(String str[])
            {
                int queue[]=new int[1000];
                note O3=new note();
                int front=0;
                int rear=4;
                queue[0]=123;
                queue[1]=124;
                queue[2]=321;
                queue[3]=567;
                queue[4]=623;
                System.out.println("Traversing the Queue:");
                O3.traverse(queue,rear,front);
                O3.size(queue,rear,front);
                
            }
        }