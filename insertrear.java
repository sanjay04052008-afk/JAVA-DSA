class ins
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
       while(rear>=front)
{
    System.out.println(deque[rear]);
    rear=rear-1;
}

}
    void insertrear(int val,int front,int rear,int deque[],int size)
    {
        if((front==0)&&(rear==size-2)||(front==rear+1))
        {
            System.out.println("Queue is full");
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            deque[rear]=val;
        }
        else if(front==0)
        {
            rear=size-1;
            deque[rear]=val;
        }
        else
        {
            rear=rear+1;
            deque[rear]=val;
        }
        
    }
}
class insertrear
{
    public static void main(String str[])
    {
        ins o1=new ins();
        int deque[]=new int[100];
       deque[0]=165;
        deque[1]=231;
        deque[2]=782;
        deque[3]=981;
        System.out.println("Before insertion:");

        o1.traverse(deque,0,3);
        o1.insertrear(1000, 0, 4, deque, 5);
        System.out.println("After insertion:");
        o1.traverse(deque, 0, 4);
    }
}