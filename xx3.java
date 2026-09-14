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
   
    int front, rear;
    QueueItem  PQ[] = new QueueItem[10];
        front = -1;
        rear = -1;
    

    void enqueue(int v, int p)
    {
        rear++;
        PQ[rear] = new QueueItem(v, p);
    }

    void traverse()
    {
        System.out.println("Front = " + front);
        System.out.println("Value\tPriority");

        for(int i = front; i <= rear; i++)
        {
            System.out.println(PQ[i].val + "\t" + PQ[i].priority);
        }

        System.out.println("Rear = " + rear);
    }
}
class xx4
{
    public static void main(String str[])
    {
        XX q = new XX();

        int value[] = {10, 20, 30};
        int priority[] = {1, 3, 2};

        System.out.println("Before Enqueue");
        q.traverse();

        for(int i = 0; i < value.length; i++)
        {
            q.enqueue(value[i], priority[i]);
        }

        System.out.println("\nAfter Enqueue");
        q.traverse();
    }
}