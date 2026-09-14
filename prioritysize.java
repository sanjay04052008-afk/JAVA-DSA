class Queueitem
{
    int val;
    int priority;

    Queueitem(int v, int p)
    {
      this.val = v;
      this.priority = p;
    }
}

class bb
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
    void size()
    { 
        if(front==-1)
        {
            System.out.println("priority Queue is empty");
        }
       else
       {
        int size;
        size=rear-front+1;
       System.out.println("Size of the priority queue :"+ size);
       }
    }
}
class prioritysize
{
    public static void main(String str[])
    {
        bb O3 = new bb();
        O3.front = 0;
        O3.rear = 3;
        O3.PQ = new Queueitem[100];
        O3.PQ[0] = new Queueitem(75,3);
        O3.PQ[1] = new Queueitem(23,4);
        O3.PQ[2] = new Queueitem(44,9);
        O3.PQ[3] = new Queueitem(90,2);
 
        
        System.out.println("Traversing the priority Queue:");
        O3.traverse();
        System.out.println("\nsize operation:");
        O3.size();
    }
}