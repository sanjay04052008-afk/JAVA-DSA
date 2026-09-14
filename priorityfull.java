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

class dd
{
    Queueitem PQ[];
    int front, rear;
    int max;
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
    boolean isFull()
    {
        if(rear==max)
        {
            System.out.println("Priority Queue is Full");
            return true;
        }
        else
        {
            System.out.println("Priority Queue is not Full");
            return false;
        }
    }

}
class priorityfull
{
    public static void main(String str[])
    {
        dd O5 = new dd();
        O5.front = 0;
        O5.rear = 3;
        O5.PQ = new Queueitem[4];
        O5.max=O5.PQ.length-1;

        
        O5.PQ[0] = new Queueitem(23,6);
        O5.PQ[1] = new Queueitem(78,5);
        O5.PQ[2] = new Queueitem(93,2);
        O5.PQ[3] = new Queueitem(17,3);
        System.out.println("Traversing the priority Queue:");
        O5.traverse();
        System.out.println("\nIsFull operation:");
        System.out.println(O5.isFull());
    }
}