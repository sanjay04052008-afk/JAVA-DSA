import java.util.Scanner;
class queue
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
class queueruntime
{
    public static void main(String str[])
    {
        System.out.println("Welcome to queue operation:");
        System.out.println("1.Traverse");
        System.out.println("2.Enqueue");
        System.out.println("3.peek");
        queue o5=new queue();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int queue[]=new int[n];
        for(int i=0;i<n;i++)
        {
            queue[i]=sc.nextInt();
        }
       System.out.printlnirear=sc.nextInt());
        int front=sc.nextInt();
        int element=sc.nextInt();
        int choice=sc.nextInt();
        if(choice==1)
        {
            o5.traverse(queue,rear,front);
        }
        else if(choice==2)
        {
            o5.enqueue(queue,rear,front,element);
        }
        else if(choice==3)
        {
            o5.peek(queue,rear);
        }
        else
        {
            System.out.println("Your Choice is not valid");
        }

    }
}