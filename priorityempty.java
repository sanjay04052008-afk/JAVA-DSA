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

class cc
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
    boolean isEmpty()
    {
        if(front==-1)
        {
            System.out.println("Priority Queue is Empty");
            return true;
        }
        else
        {
            System.out.println("Priority Queue is not Empty");
            return false;
        }
    }

}
class priorityempty
{
    public static void main(String str[])
    {
        cc O4 = new cc();
        O4.front = 0;
        O4.rear = 3;
        O4.PQ = new Queueitem[100];
        O4.PQ[0] = new Queueitem(67,5);
        O4.PQ[1] = new Queueitem(48,3);
        O4.PQ[2] = new Queueitem(88,2);
        O4.PQ[3] = new Queueitem(38,7);
        System.out.println("Traversing the priority Queue:");
        O4.traverse();
        System.out.println("\nIsEmpty operation:");
        System.out.println(O4.isEmpty());
    }
}