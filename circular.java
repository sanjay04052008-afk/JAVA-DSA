import java.util.Scanner;

class queue
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

    void enqueue(int queue[], int rear, int front, int element)
    {
        int size = queue.length;

        if(rear==size-1 && front!=0)
        {
            System.out.println("Queue overflow");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
                rear = 0;
            }
            else if(rear == size - 1)
            {
                rear = 0;
            }
            else
            {
                rear++;
            }

            queue[rear] = element;

            System.out.println("Element inserted = " + element);
        }
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

    void peek(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Peek element = " + queue[front]);
        }
    }

    void isEmpty(int queue[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue is not Empty");
        }
    }

    void isFull(int queue[], int rear, int front)
    {
        int size = queue.length;

        if((rear + 1) % size == front)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            System.out.println("Queue is not Full");
        }
    }

    void size(int queue[], int rear, int front)
    {
        int size;

        if(front == -1)
        {
            size = 0;
        }
        else if(rear >= front)
        {
            size = rear - front + 1;
        }
        else
        {
            size = queue.length - front + rear + 1;
        }

        System.out.println("Queue size = " + size);
    }
}

class circular
{
    public static void main(String str[])
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter the Queue size: ");
        int n = a.nextInt();

        int queue[] = new int[n];

        queue O1 = new queue();

        int rear = -1;
        int front = -1;

        int choice = 0;

        while(choice != 8)
        {
            System.out.println();
            System.out.println("*Circular Queue operations in Runtime*");
            System.out.println();
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.isEmpty");
            System.out.println("5.isFull");
            System.out.println("6.Traverse");
            System.out.println("7.Exit");
            System.out.println();

            System.out.print("Enter your choice(1-8): ");
            choice = a.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter the element: ");
                    int element = a.nextInt();

                    if((rear + 1) % n == front)
                    {
                        System.out.println("Queue overflow");
                    }
                    else
                    {
                        if(front == -1)
                        {
                            front = 0;
                            rear = 0;
                        }
                        else if(rear == n - 1)
                        {
                            rear = 0;
                        }
                        else
                        {
                            rear++;
                        }

                        queue[rear] = element;

                        System.out.println("Element inserted = " + element);
                    }

                    break;

                case 2:

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
                        else if(front == n - 1)
                        {
                            front = 0;
                        }
                        else
                        {
                            front++;
                        }
                    }

                    break;

                case 3:

                    O1.peek(queue, rear, front);

                    break;

                case 4:

                    O1.isEmpty(queue, rear, front);

                    break;

                case 5:

                    O1.isFull(queue, rear, front);

                    break;

                case 6:

                    O1.traverse(queue, rear, front);

                    break;

                case 7:

                    System.out.println("Program is finished!!");

                    break;

                default:

                    System.out.println("Invalid choice. Please enter valid choice!!");
            }
        }

        a.close();
    }
}