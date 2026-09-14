class ins
{
    void traverse(int deque[], int front, int rear)
    {
        System.out.println("Front = " + front);

        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println("Rear = " + rear);

        while(front >= rear)
        {
            System.out.println(deque[front]);
            front = front - 1;
        }
    }

    void insertfront(int val, int front, int rear, int deque[], int size)
    {
        if(front == size - 1)
        {
            System.out.println("Deque is full");
        }
        else if(front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            deque[front] = val;
        }
        else
        {
            front = front + 1;
            deque[front] = val;
        }
    }
}

class insertfront
{
    public static void main(String str[])
    {
        ins o1 = new ins();

        int deque[] = new int[5];

        deque[0] = 11;
        deque[1] = 22;
        deque[2] = 33;

        System.out.println("Before insertion:");
        o1.traverse(deque, 2, 0);

        o1.insertfront(100, 2, 0, deque, 5);

        System.out.println("After insertion:");
        o1.traverse(deque, 3, 0);
    }
}