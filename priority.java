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

        QueueItem PQ = new QueueItem[10];
       int size = 0;


    void enqueue(int v, int p)
    {
        PQ[size] = new QueueItem(v, p);
        size++;
    }

    void traverse()
    {
        System.out.println(Index +" "+Value+" "+Priority);

        for(int rear = 0; rear < size; rear++)
        {
            System.out.println(rear + " " + PQ[rear].val + " " + PQ[rear].priority);
        }
    }

    public static void main(String args[])
    {
        priority q = new priority();

        int value[];
        value[0]=10;
        value[1]=20;
        value[2]=30;
        value[3]=40;
        int priority[] ;
        priority[0]=1;
        priority[1]=2;
        priority[2]=3;
        priority[3]=4;
        int rear=0;
        while(rear < value.length)
       {
      q.enqueue(value[rear],priority[rear]);
        }
        q.traverse();
    }
}