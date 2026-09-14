class Queueitem
{
    int val;
    int priority;

    Queueitem(int v, int p)
    {
        val = v;
        priority = p;
    }
}
class aa
{
    Queueitem PQ[];
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
    void peek()
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

        System.out.println("Peek value = " + PQ[i].val);
        System.out.println("Peek priority = " + PQ[i].priority);
    }
    
}
class prioritypeek
{
    public static void main(String args[])
    {
        aa O3 = new aa();

        O3.PQ = new Queueitem[10];
        O3.PQ[0] = new Queueitem(66, 4);
        O3.PQ[1] = new Queueitem(89, 7);
        O3.PQ[2] = new Queueitem(45, 5);
        O3.PQ[3] = new Queueitem(37, 2);
 
        O3.front = 0;
        O3.rear = 3;
        System.out.println("Traversing the priority Queue:");
        O3.traverse();
        System.out.println("\nPeek operation:");
        O3.peek();
    }
}