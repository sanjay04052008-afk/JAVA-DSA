
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
    boolean isFull()
{
    int max=3;
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
class priorisfull
{
    public static void main(String str[])
    {
        XX o1=new XX();
        o1.PQ = new QueueItem[100];
        o1.front=-1;
        o1.rear=-1;
         System.out.println("Before Enqueue");
        o1.traverse();

        o1.enqueue(10, 1);
        o1.enqueue(20, 3);
        o1.enqueue(30, 2);
        o1.enqueue(40,4);

        System.out.println("\nAfter Enqueue");
        o1.traverse();
        System.out.println("Isfull operation:");
        System.out.println(o1.isFull());

    }
}