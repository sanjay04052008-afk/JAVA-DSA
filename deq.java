class a
{
    void traverse(int queue[], int rear, int front)
{
    if(front == -1)
    {
        System.out.println("Queue is empty");
        return;
    }

    int i=rear;

    while(true)
    {
        System.out.println(queue[i]); 

        if(i==front)
        {
            break;
        }

        if(i== 0)
        {
            i= queue.length - 1;
        }
        else
        {
           i = i - 1;
        }
    }

    System.out.println("Front = " + front);
    System.out.println("Rear = " + rear);
}
void dequeue(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue underflow");
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
class deq
{
    public static void main(String str[])
    {
        a o2=new a();
        int queue[]={10,20,30,40};
        System.out.println("Before Dequeue operation:");
        o2.traverse(queue,3,0);
        o2.dequeue(queue,3,0);
        System.out.println("After Dequeue operation:");
        o2.traverse(queue,3,1);


    }
}