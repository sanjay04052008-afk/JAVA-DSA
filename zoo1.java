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

class XX
{
    QueueItem PQ[];
    int front, rear;

    void traverse()
    {
        System.out.println("Front = " + front);

        if(front == -1)
        {
            System.out.println("Priority Queue is empty");
        }
        else
        {
            System.out.println("value\tpriority");

            for(int i = front; i <= rear; i++)
            {
                System.out.println(PQ[i].val + "\t" + PQ[i].priority);
            }
        }

        System.out.println("Rear = " + rear);
    }

    void enqueue(int v, int p)
    {
        rear++;

        if(front == -1)
        {
            front = 0;
        }

        PQ[rear] = new QueueItem(v, p);
    }

    void dequeue()
    {
        if(front == -1)
        {
            System.out.println("Priority Queue is empty");
            return;
        }

        int i = front;

   
        for(int j = front + 1; j <= rear; j++)
        {
            if(PQ[j].priority > PQ[i].priority)
            {
                i = j;
            }
        }

        
        System.out.println("Deleted value = " + PQ[i].val);
        System.out.println("Deleted priority = " + PQ[i].priority);

        while(i < rear)
        {
            PQ[i] = PQ[i + 1];
            i++;
        }

        rear=rear-1;

        if(rear < front)
        {
            front = -1;
            rear = -1;
        }
    }
}

class zoo1
{
    public static void main(String args[])
    {
        XX O1 = new XX();

        O1.PQ = new QueueItem[10];

        O1.front = -1;
        O1.rear = -1;

        System.out.println("Before Enqueue");
        O1.traverse();

        O1.enqueue(10, 1);
        O1.enqueue(20, 3);
        O1.enqueue(30, 2);

        System.out.println("\nAfter Enqueue");
        O1.traverse();

        System.out.println("\nAfter Dequeue");
        O1.dequeue();

        O1.traverse();
    }
}