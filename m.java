import java.util.Scanner;

class ins
{
    int front = -1;
    int rear = -1;
    int size;
    int deque[];

    ins(int n)
    {
        size = n;
        deque = new int[n];
    }

    boolean isEmpty()
    {
        return front == -1;
    }

    boolean isFull()
    {
        return front == size - 1;
    }

    void insertfront(int val)
    {
        if(isFull())
        {
            System.out.println("Deque is full");
            return;
        }

        if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else
        {
            front++;
        }

        deque[front] = val;

        System.out.println("Inserted " + val + " at Front");
        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    void insertrear(int val)
    {
        if(isFull())
        {
            System.out.println("Deque is full");
            return;
        }

        if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else
        {
            rear++;
        }

        deque[rear] = val;

        System.out.println("Inserted " + val + " at Rear");
        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    void deletefront()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted Front = " + deque[front]);

        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front--;
        }

        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    void deleterear()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted Rear = " + deque[rear]);

        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            rear--;
        }

        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    void getfront()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Front Element = " + deque[front]);
    }

    void getrear()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Rear Element = " + deque[rear]);
    }

    void isempty()
    {
        if(isEmpty())
        {
            System.out.println("Deque is Empty");
        }
        else
        {
            System.out.println("Deque is not Empty");
        }
    }

    void isfull()
    {
        if(isFull())
        {
            System.out.println("Deque is Full");
        }
        else
        {
            System.out.println("Deque is not Full");
        }
    }

    void traverse()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);

        int i = front;

        while(i >= rear)
        {
            System.out.println(deque[i]);
            i--;
        }
    }
}


class m
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Deque size: ");
        int n = sc.nextInt();

        ins o1 = new ins(n);

        int choice = 0;

        while(choice != 11)
        {
            System.out.println();
            System.out.println("* Deque Operations *");
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
            System.out.println();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int v1 = sc.nextInt();
                    o1.insertfront(v1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int v2 = sc.nextInt();
                    o1.insertrear(v2);
                    break;

                case 3:
                    o1.deletefront();
                    break;

                case 4:
                    o1.deleterear();
                    break;

                case 5:
                    o1.getfront();
                    break;

                case 6:
                    o1.getrear();
                    break;

                case 7:
                    o1.isempty();
                    break;

                case 8:
                    o1.isfull();
                    break;

                case 9:
                    o1.traverse();
                    break;

                case 10:
                    System.out.println("Program finished.");
                    choice = 11;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}