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

    void traverse()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Front = " + front);

            int i = front;

            while(i <= rear)
            {
                System.out.println(deque[i]);
                i++;
            }

            System.out.println("Rear = " + rear);
        }
    }

    void insertfront(int val)
    {
        if((front == 0 && rear == size-1) || (front == rear+1))
        {
            System.out.println("Deque is full");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            deque[front] = val;
        }
        else if(front == 0)
        {
            front = size - 1;
            deque[front] = val;
        }
        else
        {
            front=front-1;
            deque[front] = val;
        }

        System.out.println("Element inserted at Front");
    }

    void insertrear(int val)
    {
        if((front == 0 && rear == size-1) || (front == rear+1))
        {
            System.out.println("Deque is full");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            deque[rear] = val;
        }
        else if(rear == size-1)
        {
            rear = 0;
            deque[rear] = val;
        }
        else
        {
            rear++;
            deque[rear] = val;
        }

        System.out.println("Element inserted at Rear");
    }

    void deletefront()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else if(front == rear)
        {
            System.out.println("Deleted Front = " + deque[front]);
            front = rear = -1;
        }
        else if(front == size-1)
        {
            System.out.println("Deleted Front = " + deque[front]);
            front = 0;
        }
        else
        {
            System.out.println("Deleted Front = " + deque[front]);
            front++;
        }
    }

    void deleterear()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else if(front == rear)
        {
            System.out.println("Deleted Rear = " + deque[rear]);
            front = rear = -1;
        }
        else if(rear == 0)
        {
            System.out.println("Deleted Rear = " + deque[rear]);
            rear = size - 1;
        }
        else
        {
            System.out.println("Deleted Rear = " + deque[rear]);
            rear--;
        }
    }

    void getfront()
    {
        if(front == -1)
            System.out.println("Deque is empty");
        else
            System.out.println("Front Element = " + deque[front]);
    }

    void getrear()
    {
        if(rear == -1)
            System.out.println("Deque is empty");
        else
            System.out.println("Rear Element = " + deque[rear]);
    }

    void isempty()
    {
        if(front == -1 && rear == -1)
            System.out.println("Deque is Empty");
        else
            System.out.println("Deque is not Empty");
    }

    void isfull()
    {
        if((front == 0 && rear == size-1) || (front == rear+1))
            System.out.println("Deque is Full");
        else
            System.out.println("Deque is not Full");
    }
}

class dequeallrun
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter the Deque size: ");
        int n = a.nextInt();

        fan O1 = new fan(n);

        int choice = 0;

        while(choice != 10)
        {
            System.out.println();
            System.out.println("* Deque Operations in Runtime *");
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
                    O1.insertfront(v1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int v2 = a.nextInt();
                    O1.insertrear(v2);
                    break;

                case 3:
                    O1.deletefront();
                    break;

                case 4:
                    O1.deleterear();
                    break;

                case 5:
                    O1.getfront();
                    break;

                case 6:
                    O1.getrear();
                    break;

                case 7:
                    O1.isempty();
                    break;

                case 8:
                    O1.isfull();
                    break;

                case 9:
                    O1.traverse();
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