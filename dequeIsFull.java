class ins
{
    void traverse(int deque[],int front,int rear,int size)
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
 boolean isFull(int deque[],int rear,int front)
 {
    int size=rear-front+1;
    if(rear==size-1)
    {   
        System.out.println("Double ended queue is Full");
        return true;
    }
    else
    {
        System.out.println("Double ended queue is not Full");
        return false;
    }
 }
}
class dequeIsFull
{
    public static void main(String str[])
    {
        ins o1=new ins();
        int deque[]=new int[100];
        deque[0]=165;
        deque[1]=231;
        deque[2]=782;
        deque[3]=981;
        System.out.println("Double ended queue:");
        o1.traverse(deque,0,3,4);
        System.out.println("IsFull operation:");
        o1.isFull(deque,3,0);
      }
}