import java.util.Scanner;

class deque
{
    void traverse(int deque[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Deque is empty");
            return;
        }

        int i = front;

        while(true)
        {
            System.out.println(deque[i]);

            if(i == rear)
            {
                break;
            }

            if(i == 0)
            {
                i = deque.length - 1;
            }
            else
            {
                i--;
            }
        }

        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }


    void insertfront(int deque[], int rear, int front, int element)
    {
        int size = deque.length;

        if((front + 1) % size == rear)
        {
            System.out.println("Deque overflow");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
                rear = 0;
            }
            else if(front == size - 1)
            {
                front = 0;
            }
            else
            {
                front++;
            }

            deque[front] = element;

            System.out.println("Element inserted at Front = " + element);
            System.out.println("Front = " + front);
            System.out.println("Rear = " + rear);
        }
    }


    void insertrear(int deque[], int rear, int front, int element)
    {
        int size = deque.length;

        if(rear == 0)
        {
            if(front == size - 1)
            {
                System.out.println("Deque overflow");
                return;
            }
        }
        else
        {
            if(rear - 1 == front)
            {
                System.out.println("Deque overflow");
                return;
            }
        }

        if(front == -1)
        {
            front = 0;
            rear = 0;
        }
        else if(rear == 0)
        {
            rear = size - 1;
        }
        else
        {
            rear--;
        }

        deque[rear] = element;

        System.out.println("Element inserted at Rear = " + element);
        System.out.println("Front = " + front);
        System.out.println("Rear = " + rear);
    }


    void deletefront(int deque[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Deque underflow");
        }
        else
        {
            System.out.println("Deleted Front = " + deque[front]);

            deque[front] = 0;

            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else if(front == 0)
            {
                front = deque.length - 1;
            }
            else
            {
                front--;
            }

            System.out.println("Front = " + front);
            System.out.println("Rear = " + rear);
        }
    }


    void deleterear(int deque[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Deque underflow");
        }
        else
        {
            System.out.println("Deleted Rear = " + deque[rear]);

            deque[rear] = 0;

            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else if(rear == deque.length - 1)
            {
                rear = 0;
            }
            else
            {
                rear++;
            }

            System.out.println("Front = " + front);
            System.out.println("Rear = " + rear);
        }
    }


    void getfront(int deque[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Front Element = " + deque[front]);
        }
    }


    void getrear(int deque[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Deque is empty");
        }
        else
        {
            System.out.println("Rear Element = " + deque[rear]);
        }
    }


    void isEmpty(int deque[], int rear, int front)
    {
        if(front == -1)
        {
            System.out.println("Deque is Empty");
        }
        else
        {
            System.out.println("Deque is not Empty");
        }
    }


    void isFull(int deque[], int rear, int front)
    {
        int size = deque.length;

        if((front + 1) % size == rear)
        {
            System.out.println("Deque is Full");
        }
        else
        {
            System.out.println("Deque is not Full");
        }
    }
}


class dequerunnew
{
    public static void main(String str[])
    {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter the Deque size: ");
        int n = a.nextInt();

        int deque[] = new int[n];

        deque O1 = new deque();

        int rear = -1;
        int front = -1;

        int choice = 0;

        while(choice != 10)
        {
            System.out.println();
            System.out.println("* Circular Deque Operations in Runtime *");
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
            choice = a.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter the element: ");
                    int element1 = a.nextInt();

                    if(front == -1)
                    {
                        front = 0;
                        rear = 0;

                        deque[front] = element1;

                        System.out.println("Element inserted at Front = " + element1);
                    }
                    else if((front + 1) % n == rear)
                    {
                        System.out.println("Deque overflow");
                    }
                    else
                    {
                        if(front == n - 1)
                        {
                            front = 0;
                        }
                        else
                        {
                            front++;
                        }

                        deque[front] = element1;

                        System.out.println("Element inserted at Front = " + element1);
                    }

                    System.out.println("Front = " + front);
                    System.out.println("Rear = " + rear);

                    break;


                case 2:

                    System.out.print("Enter the element: ");
                    int element2 = a.nextInt();

                    if(front == -1)
                    {
                        front = 0;
                        rear = 0;

                        deque[rear] = element2;

                        System.out.println("Element inserted at Rear = " + element2);
                    }
                    else if(rear == 0 && front == n - 1)
                    {
                        System.out.println("Deque overflow");
                        break;
                    }
                    else if(rear != 0 && rear - 1 == front)
                    {
                        System.out.println("Deque overflow");
                        break;
                    }
                    else
                    {
                        if(rear == 0)
                        {
                            rear = n - 1;
                        }
                        else
                        {
                            rear--;
                        }

                        deque[rear] = element2;

                        System.out.println("Element inserted at Rear = " + element2);
                    }

                    System.out.println("Front = " + front);
                    System.out.println("Rear = " + rear);

                    break;


                case 3:

                    if(front == -1)
                    {
                        System.out.println("Deque underflow");
                    }
                    else
                    {
                        System.out.println("Deleted Front = " + deque[front]);

                        deque[front] = 0;

                        if(front == rear)
                        {
                            front = -1;
                            rear = -1;
                        }
                        else if(front == 0)
                        {
                            front = n - 1;
                        }
                        else
                        {
                            front--;
                        }

                        System.out.println("Front = " + front);
                        System.out.println("Rear = " + rear);
                    }

                    break;


                case 4:

                    if(front == -1)
                    {
                        System.out.println("Deque underflow");
                    }
                    else
                    {
                        System.out.println("Deleted Rear = " + deque[rear]);

                        deque[rear] = 0;

                        if(front == rear)
                        {
                            front = -1;
                            rear = -1;
                        }
                        else if(rear == n - 1)
                        {
                            rear = 0;
                        }
                        else
                        {
                            rear++;
                        }

                        System.out.println("Front = " + front);
                        System.out.println("Rear = " + rear);
                    }

                    break;


                case 5:

                    O1.getfront(deque, rear, front);

                    break;


                case 6:

                    O1.getrear(deque, rear, front);

                    break;


                case 7:

                    O1.isEmpty(deque, rear, front);

                    break;


                case 8:

                    O1.isFull(deque, rear, front);

                    break;


                case 9:

                    O1.traverse(deque, rear, front);

                    break;


                case 10:

                    System.out.println("Program is finished!!");

                    break;


                default:

                    System.out.println("Invalid choice. Please enter valid choice!!");
            }
        }

        a.close();
    }
}
