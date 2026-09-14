import java.util.Scanner;

class fan
{
    int front = -1;
    int rear = -1;
    int size;
    int deque[];

    fan(int n)
    {
        size = n;
        deque = new int[n];
    }

    // Insert Front
    void insertfront(int val)
    {
        if(rear == size - 1)
        {
            System.out.println("Deque is full");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            deque[front] = val;
        }
        else
        {
            for(int i = rear; i >= front; i--)
            {
                deque[i + 1] = deque[i];
            }

            deque[front] = val;
            rear++;
        }
    }

    // Insert Rear
    void insertrear(int val)
    {
        if(rear == size - 1)
        {
            System.out.println("Deque is full");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            deque[rear] = val;
        }
        else
        {
            rear++;
            deque[rear] = val;
        }
    }

    // Delete Front
    void deletefront()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else if(front == rear)
        {
            front = rear = -1;
        }
        else
        {
            for(int i = front; i < rear; i++)
            {
                deque[i] = deque[i + 1];
            }

            rear--;
        }
    }

    // Delete Rear
    void deleterear()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else if(front == rear)
        {
            front = rear = -1;
        }
        else
        {
            rear--;
        }
    }

    // Get Front
    void getfront()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Front element = " + deque[front]);
        }
    }

    // Get Rear
    void getrear()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Rear element = " + deque[rear]);
        }
    }

    // Is Empty
    void isempty()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Deque is not empty");
        }
    }

    // Is Full
    void isfull()
    {
        if(rear == size - 1)
        {
            System.out.println("Deque is full");
        }
        else
        {
            System.out.println("Deque is not full");
        }
    }

    // Traverse
    void traverse()
    {
         System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Deque elements:");

            for(int i = front; i <= rear; i++)
            {
                System.out.println(deque[i]);
            }
        }
    }
}

class run
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter Deque size: ");
        int n = a.nextInt();

        fan d = new fan(n);

        int choice = 0;

        while(choice != 10)
        {
            System.out.println();
            System.out.println("1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete Rear");
            System.out.println("5. Get Front");
            System.out.println("6. Get Rear");
            System.out.println("7. Is Empty");
            System.out.println("8. Is Full");
            System.out.println("9. Traverse");
            System.out.println("10. Exit");

            System.out.print("Enter your choice(1-10): ");
            choice = a.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int v1 = a.nextInt();
                    d.insertfront(v1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int v2 = a.nextInt();
                    d.insertrear(v2);
                    break;

                case 3:
                    d.deletefront();
                    break;

                case 4:
                    d.deleterear();
                    break;

                case 5:
                    d.getfront();
                    break;

                case 6:
                    d.getrear();
                    break;

                case 7:
                    d.isempty();
                    break;

                case 8:
                    d.isfull();
                    break;

                case 9:
                    d.traverse();
                    break;

                case 10:
                    System.out.println("Program is finished!!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        a.close();
    }
}