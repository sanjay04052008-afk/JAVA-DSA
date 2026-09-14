class queue
{
    void traverse(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Rear = " + rear);

       

        while(rear >= front)
        {
            System.out.println(queue[rear]);
            rear--;
        }

        System.out.println("Front = " + front);
    }

    void dequeue(int queue[], int front, int rear)
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Deleted element = " + queue[front]);

            queue[front] = 0;

            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else if(front == queue.length - 1)
            {
                front = 0;
            }
            else
            {
                front++;
            }
        }
    }
}

class circulardequeue
{
    public static void main(String str[])
    {
        queue o1 = new queue();

        int queue[] = new int[6];

        queue[0] = 500;
        queue[1] = 10;
        queue[2] = 20;
        queue[3] = 30;
        queue[4] = 40;

        int front = 0;
        int rear = 4;

        System.out.println("Before circular dequeue:");

        o1.traverse(queue, rear, front);

        o1.dequeue(queue, front, rear);

        front = 1;

        System.out.println("After circular dequeue:");

        o1.traverse(queue, rear, front);
    }
}