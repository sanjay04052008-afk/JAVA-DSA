class QueueItem
{
    int val;
    int priority;

    QueueItem(int v, int p)
    {
        val = v;
        priority = p;
    }
}

class priority
{
    QueueItem PQ[] = new QueueItem[10];

    int front = -1;
    int rear = -1;

    
    void traverse()
    {
        if(front == -1)
        {
            front=-1;
            rear=-1;
            System.out.println("Priority Queue is empty");
            return;
        }
     System.out.println("Value\tPriority");
      

        while(front <= rear)
        {
            if(front == 0)
            {
                System.out.println("front=" + front + " ");
            }
            System.out.println(PQ[front].val+"\t"+PQ[front].priority);
            front=front+1;
            if(front == rear)
            {
                System.out.println("rear=" + rear + " ");
            }
            
        }
        front=0;
    }
    void enqueue(int v, int p)
    {
        if(rear == PQ.length - 1)
        {
            System.out.println("Priority Queue is full");
            return;
        }

        if(front == -1)
        {
            front = 0;
        }

        rear++;
        PQ[rear] = new QueueItem(v, p);
    }

}
class priorityenqueue{
    public static void main(String args[])
    {   
        priority q = new priority();
        int value[]={10,20,30};
        int priority[]={1,3,2};
        System.out.println("Before Enqueue in priority queue:");
         q.traverse();
        q.enqueue(value[front], priority[front]);
        System.out.println("After Enqueue in priority queue:");
        q.traverse();

    }
}