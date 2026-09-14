import java.util.Scanner;

class ins
{
    int front = -1;
    int rear = -1;
    int size;
    int count = 0;

    int deque[];

    ins(int n)
    {
        size = n;
        deque = new int[n];
    }

    boolean isEmpty()
    {
        return count == 0;
    }

    boolean isFull()
    {
        return count == size;
    }

    // INSERT FRONT
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

            if(front == size)
            {
                front = 0;
            }
        }

        deque[front] = val;
        count++;

        System.out.println("Inserted " + val + " at Front");
        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    // INSERT REAR
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

            if(rear == size)
            {
                rear = 0;
            }
        }

        deque[rear] = val;
        count++;

        System.out.println("Inserted " + val + " at Rear");
        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    // DELETE FRONT
    void deletefront()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted Front = " + deque[front]);

        count--;

        if(count == 0)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front++;

            if(front == size)
            {
                front = 0;
            }
        }

        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    // DELETE REAR
    void deleterear()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Deleted Rear = " + deque[rear]);

        count--;

        if(count == 0)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            rear++;

            if(rear == size)
            {
                rear = 0;
            }
        }

        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }

    // GET FRONT
    void getfront()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Front Element = " + deque[front]);
    }

    // GET REAR
    void getrear()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Rear Element = " + deque[rear]);
    }

    // IS EMPTY
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

    // IS FULL
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

    // TRAVERSE
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
        int printed = 0;

        while(printed < count)
        {
            System.out.println(deque[i]);

            printed++;

            i++;

            if(i == size)
            {
                i = 0;
            }
        }
    }
}


class m1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Deque size: ");
        int n = sc.nextInt();

        ins o1 = new ins(n);

        int choice = 0;

        while(choice != 10)
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

                    break;


                default:

                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}