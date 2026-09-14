class del
{
    void traverse(int deque[],int front,int rear)
    {
        System.out.println("Front ="+front);
        
        if(front==-1 && rear==-1)
        {
            System.out.println("Deque is empty");
            return;
        }
        System.out.println("Rear ="+rear);
       while(front>=rear)
{
    System.out.println(deque[front]);
    front=front-1;
}
    }
void deletefront(int deque[],int front,int rear,int size)
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Deque is empty");
        }
        else if(front == rear)
        {
            System.out.println("Deleted Front = " + deque[front+1]);
            front = rear = -1;
        }
        else if(front == size-1)
        {
            System.out.println("Deleted Front = " + deque[front+1]);
            front = 0;
        }
        else
        {
            System.out.println("Deleted Front = " + deque[front+1]);
            front++;
        }
    }
}
class deletefront
{
    public static void main(String str[])
    {
        del o1 = new del();

        int deque[] = new int[5];

        deque[0] = 11;
        deque[1] = 22;
        deque[2] = 33;
        deque[3] = 44;

        System.out.println("Before Deletion:");
        o1.traverse(deque, 3, 0);

        o1.deletefront(deque,2,0,4);

        System.out.println("After Deletion:");
        o1.traverse(deque,2, 0);
}
}
