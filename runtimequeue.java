import java.util.Scanner;

class queue
{
        void traverse(int queue[], int rear, int front)
    {
        if(front == -1)
        {
 System.out.println("Front = " + front);
        }
System.out.println("Rear = " + rear);
       

        while(rear >= front)
        {
            System.out.println(queue[rear]);
            rear--;
        }

        System.out.println("Front = " + front);
    }


    void enqueue(int queue[], int rear, int front, int element)
    {
        int size = queue.length;

        if(rear == size - 1)
        {
            System.out.println("Queue overflow");
            return;
        }

        if(front == -1)
        {
            front = 0;
        }

        rear++;
        queue[rear] = element;
    }

    void dequeue(int queue[], int rear, int front)
    {
        if(front == -1)
        {
           System.out.println("front =-1"); 
           System.out.println("Rear =-1");
        }

        System.out.println("Deleted element = " + queue[front]);

        // Shift elements to the left
        for(int i = front; i < rear; i++)
        {
            queue[i] = queue[i + 1];
        }

        rear--;

        // If last element was deleted
        if(rear < front)
        {
            front = -1;
            rear = -1;
        }
    }

    void peek(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            System.out.println("Peek element = " + queue[front]);
        }
    }

    boolean isFull(int queue[], int rear, int max)
    {
        if(rear == max)
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

    boolean isEmpty(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue is Empty");
            return true;
        }
        else
        {
            System.out.println("Queue is not Empty");
            return false;
        }
    }

    void size(int queue[], int rear, int front)
    {
        int size;

        if(front == -1)
        {
            size = 0;
        }
        else
        {
            size = rear - front + 1;
        }

        System.out.println("Queue size = " + size);
    }
}

class runtimequeue
{
    public static void main(String str[])
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter the Queue elements: ");
        int n = a.nextInt();

        int queue[] = new int[n];

        queue O1 = new queue();

        int rear = -1;
        int front = -1;

        int max = queue.length - 1;

        int choice = 0;

        while(choice != 8)
        {
            System.out.println();
            System.out.println("*Queue operations in Runtime*");
            System.out.println();

            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.isEmpty");
            System.out.println("5.isFull");
            System.out.println("6.Size");
            System.out.println("7.Traverse");
            System.out.println("8.Exit");

            System.out.println();

            System.out.print("Enter your choice(1-8): ");
            choice = a.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter the element: ");
                    int element = a.nextInt();

                    if(rear == max)
                    {
                        System.out.println("Queue overflow");
                    }
                    else
                    {
                        rear++;
                        queue[rear] = element;

                        if(front == -1)
                        {
                            front = 0;
                        }
                    }

                    break;

                case 2:

                    if(front == -1)
                    {
                        System.out.println("Queue is empty");
                    }
                    else
                    {
                        System.out.println("Deleted element = " + queue[front]);

                        for(int i = front; i < rear; i++)
                        {
                            queue[i] = queue[i + 1];
                        }

                        rear--;

                        // Last element deleted
                        if(rear < front)
                        {
                            front = -1;
                            rear = -1;
                        }
                    }

                    break;

                case 3:

                    O1.peek(queue, rear, front);

                    break;

                case 4:

                    System.out.println(O1.isEmpty(queue, rear, front));

                    break;

                case 5:

                    System.out.println(O1.isFull(queue, rear, max));

                    break;

                case 6:

                    O1.size(queue, rear, front);

                    break;

                case 7:

                    O1.traverse(queue, rear, front);

                    break;

                case 8:

                    System.out.println("Program is finished!!");

                    break;

                default:

                    System.out.println(
                        "Invalid choice. Please enter the valid choices!!"
                    );
            }
        }

        a.close();
    }
}