import java.util.Scanner;

class all
{
    void traverse(int queue[], int rear, int front)
    {
        if(rear != -1)
        {
            System.out.println("Rear = " + rear);
        }

        while(rear >= 0)
        {
            System.out.println(queue[rear]);
            rear = rear - 1;
        }

        if(front != -1)
        {
            System.out.println("Front = " + front);
        }
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

        rear = rear + 1;
        queue[rear] = element;

        System.out.println("Element inserted = " + element);
    }

    void peek(int queue[], int rear)
    {
        if(rear == -1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            System.out.println("Peek = " + queue[rear]);
        }
    }
}

class a11
{
    public static void main(String str[])
    {
        all o1 = new all();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int n = sc.nextInt();

        int queue[] = new int[n];

        System.out.println("Enter queue elements:");

        for(int i = 0; i < n; i++)
        {
            queue[i] = sc.nextInt();
        }

        System.out.print("Enter front: ");
        int front = sc.nextInt();

        System.out.print("\nEnter rear: ");
        int rear = sc.nextInt();

        System.out.println("1. Enqueue");
        System.out.println("2. Peek");
        System.out.println("3. Traverse");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            System.out.print("Enter element: ");
            int element = sc.nextInt();

            o1.enqueue(queue, rear, front, element);
        }
        else if(choice == 2)
        {
            o1.peek(queue, rear);
        }
        else if(choice == 3)
        {
            o1.traverse(queue, rear, front);
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}