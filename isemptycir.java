 
 class queue
 {
    void traverse(int queue[], int rear, int front)
{
    if(front == -1)
    {
        System.out.println("Queue is empty");
        return;
    }

    int i=rear;

    while(true)
    {
        System.out.println(queue[i]);

        if(i==front)
        {
            break;
        }

        if(i== 0)
        {
            i= queue.length - 1;
        }
        else
        {
           i = i - 1;
        }
    }

    System.out.println("Front = " + front);
    System.out.println("Rear = " + rear);
}

boolean isEmpty(int queue[], int rear, int front)
    {
        if(front == -1)
        {  
            return true;
        
        }
        else
        {
            return false;
            
        }
    }
}
class isemptycir
{
    public static void main(String str[])
    {
queue o4=new queue();
int queue[]={132,421,569,651};
int front=0;
int rear=3;
System.out.println("Traversing the queue:");
o4.traverse(queue,rear,front);
System.out.println("ISempty operation:");
System.out.println(o4.isEmpty(queue,rear,front));
    }
}
