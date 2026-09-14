import java.util.Scanner;

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

class fan
{
    Queueitem PQ[];
    int front=-1;
    int rear=-1;
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
    void enqueue(int v,int p)
    {
        if(rear == max)
        {
            System.out.println("Priority Queue is full");
        }
        else
        {
            rear++;

            if(front== -1)
                front= 0;

            PQ[rear] = new Queueitem(v, p);

            System.out.println("Element inserted");
        }
    }
    void dequeue()
    {
        if(front == -1)
        {
            System.out.println("Priority Queue is empty");
        }
        else
        {
            int i = front;
            for(int j = front+ 1; j <= rear; j++)
            {
                if(PQ[j].priority > PQ[i].priority)
                {
                     i=j;
                }
            }

            System.out.println("Deleted value = " + PQ[i].val);
            System.out.println("Priority = " + PQ[i].priority);

            for(int j= front; j< rear; j++)
            {
                PQ[j] = PQ[j + 1];
            }

            rear--;

            if(rear == -1)
                front = -1;
        }
    }
    void peek()
    {
        if(front== -1)
        {
            System.out.println("priority Queue is empty");
        }
        else
        {
            int i = front;

            for(int j = front + 1; j <= rear; j++)
            {
                if(PQ[j].priority > PQ[i].priority)
                {
                  i=j;
                }
            }

            System.out.println("Peek value = " + PQ[i].val);
            System.out.println("Peek Priority = " + PQ[i].priority);
        }
    }
    void size()
    {
        if(front== -1)
            System.out.println("priority Queue size = 0");
        else
            System.out.println("priority Queue size = " + (rear-front + 1));
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
    boolean isFull()
    {
        if(rear==max)
        {
            System.out.println("priority Queue is Full");
            return true;
        }
        else{
            System.out.println("Priority Queue is not Full");
            return false;
        }
    }
}

class priorityallrun
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the priority Queue size:");
        int n=a.nextInt();
        fan O2 = new fan();

        O2.PQ = new Queueitem[n]; 
        O2.max=O2.PQ.length-1;
        int choice = 0;
        while(choice != 8)
        {
            System.out.println();
            System.out.println("*Priority Queue operations in Runtime*");
            System.out.println();

            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.Size");
            System.out.println("5.IsEmpty");
            System.out.println("6.IsFull");
            System.out.println("7.Traverse");
            System.out.println("8.Exit");
            System.out.println();

            System.out.print("Enter your choice(1-8): ");
            choice = a.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter value: ");
                    int v = a.nextInt();

                    System.out.print("Enter priority: ");
                    int p = a.nextInt();

                    O2.enqueue(v,p);

                    break;

                case 2:

                    O2.dequeue();

                    break;

                case 3:

                    O2.peek();

                    break;

                case 4:

                    O2.size();

                    break;
                case 5:
                    System.out.println(O2.isEmpty());
                    break;

                case 6:
                    System.out.println(O2.isFull());
                    break;

                case 7:

                    O2.traverse();

                    break;

                case 8:

                    System.out.println("Program is finished!!");

                    break;

                default:

                    System.out.println("Invalid choice. Please enter a valid choice.");

                    break;
            }
        }

        a.close();
    }
}