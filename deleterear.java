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
       while(rear>=front)
{
    System.out.println(deque[rear]);
    rear=rear-1;
}

}
    void deleterear(int deque[],int front,int rear,int size)
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
 }
class deleterear
{
    public static void main(String str[])
    {
        del o1=new del();
        int deque[]=new int[100];
        deque[0]=165;
        deque[1]=231;
        deque[2]=782;
        deque[3]=981;
        System.out.println("Before deletion:");

        o1.traverse(deque,0,3);
        o1.deleterear(deque,0,3,4);
        System.out.println("After deletion:");
        o1.traverse(deque, 0, 2);
    }
}
   