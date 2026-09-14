import java.util.Scanner;
 class all
{

    void traverse(int queue[],int rear,int front)
  {

    if(rear!=-1)
    {
        System.out.println("Rear ="+(rear));
    }
    while(rear>=0)
    {
        System.out.println(queue[rear]);
        rear=rear-1;
    }
    if(front!=-1)
    
        {
            System.out.println("Front ="+(front));
        }
  } 
    

        void enqueue(int queue[],int rear,int front,int element)
    {
     
      int size=queue.length;
     if(rear==size-1)
     {
        System.out.println("Queue overflow");
        return;
     }
     if(front==-1)
     {
        front=0;
     }
     rear=rear+1;
     queue[rear]=element;
    }
    

    void peek(int queue[],int rear)
    {
       
        if(rear==-1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            System.out.println(queue[rear]);
        }
    }
}
class allqueueopr
{
    public static void main(String str[])
    
    {
        
        all o1=new all();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int queue[] = new int[n];

        for (int i = 0; i < n; i++) {
        queue[i] = sc.nextInt();
}

   int front=sc.nextInt();
    int element=sc.nextInt();
    int rear=sc.nextInt();
    int choice=sc.nextInt();
    if(choice==1)
    {
        o1.traverse(queue,rear,front);
    }
else if(choice==2)
{
    o1.enqueue(queue, rear, front, element);
}
else if(choice==3)
{
    o1.peek(queue, rear);
}
else
{
    System.out.println("Invalid Choice");
}

    }
    
}