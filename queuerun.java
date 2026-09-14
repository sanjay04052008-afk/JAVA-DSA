import java.util.Scanner;
class queue
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Rear =");
	int rear=sc.nextInt();
	int queue[]=new int[n];
	System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++)
        {
            queue[i]=sc.nextInt();
        }
	System.out.print("Front =");
	int front=sc.nextInt();
void traverse()
{ 
	System.out.print("Enter array size:");
	int n=sc.nextInt();
	if(rear!=-1)
    {   System.out.println("Queue elements:");
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
 void enqueue()
    {
     System.out.print("Enter array size:");
	int n=sc.nextInt();	 
        System.out.print("Front =");
	int front=sc.nextInt();
	System.out.print("Element to insert =");
		int element=sc.nextInt();
	
       
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
    void peek()
    {   
        if(rear==-1)
        {
            System.out.println("Queue underflow");
        }
        else
        {   System.out.print("Peek element of the queue =");
            System.out.println(queue[rear]);
        }
    }
}
class queuerun
{
    public static void main(String str[])
    { queue o5=new queue();
        System.out.println("Welcome to queue operation:");
        System.out.println("1.Traverse");
        System.out.println("2.Enqueue");
        System.out.println("3.peek");
Scanner sc=new Scanner(System.in);
	System.out.print("Enter your choice =");
	int choice=sc.nextInt();
	switch(choice)
        {
         case 1 :o5.traverse();
		break;
	 case 2 :o5.enqueue();
		break;
         case 3 :o5.peek();
		break;
        default : System.out.println("Your Choice is not valid");

     
         

}






      
	
    }
}