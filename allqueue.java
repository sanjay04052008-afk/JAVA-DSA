import java.util.Scanner;
class allqueue
{
    public static void main(String str[])
{
     Scanner sc=new Scanner(System.in);
  int value=sc.nextInt();
  switch(value)
{
    case 1:System.out.println("Queue elements:");
    {
    void traverse(int queue[],int rear,int front)
  {
    Scanner sc=new Scanner(System.in);
    rear=sc.nextInt();
    front=sc.nextInt();
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
  break;
}
    case 2:System.out.println("Enqueue operation:");
    {
    void enqueue(int queue[],int rear,int front,int element)
    {
     int size=sc.nextInt();
     size=queue.length;
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
    break;
}
     case 3:System.out.println("peek operation");
     {
    void peek(int queue[],int rear)
    {
        rear=sc.nextInt();
        if(rear==-1)
        {
            System.out.println("Queue underflow");
        }
        else
        {
            System.out.println(queue[rear]);
        }
    }
    break;
}
    case 4:System.out.println("Isempty operation:");
    {
    boolean isEmpty(int queue[],int rear)
    {
        rear=sc.nextInt();
        if(rear==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    break;
}
    case 5:System.out.println("Isfull operation:");
    {
    boolean isFull(int queue[],int rear,int max)
    {
        rear=sc.nextInt();
        max=sc.nextInt();
        if(rear==max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    break;
}
    case 6:System.out.println("Size operation:");
    {
     void size(int queue[],int rear)
    {
        if(rear!=-1)
        {
            System.out.println("Queue size is:"+(rear));
        }
    }
    break;
}
    default : System.out.println("Invalid operation");
}
}
}
