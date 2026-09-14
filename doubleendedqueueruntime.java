import java.util.Scanner;
class deque
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
    void insertfront(int val,int front,int rear,int deque[],int size)
    {
        if((front==0)&&(rear==size-1)||(front==rear+1))
        {
            System.out.println("Queue is full");
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            deque[front]=val;
        }
        else if(front==0)
        {
            front=size-1;
            deque[front]=val;
        }
        else
        {
            front=front-1;
            deque[front]=val;
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
void getfront(int deque[],int front)
 {
 if(front!=-1)
 {
  System.out.println("Front ="+front);
  System.out.println("Front element:"+deque[front]);
 }
 }  
void getrear(int deque[],int rear)
 {
 if(rear!=-1)
 {
  System.out.println("Rear ="+rear);
  System.out.println("Rear element:"+deque[rear]);
 }
 }  
boolean isEmpty(int deque[],int rear,int front)
 {
    if(front==-1)
    {   
        System.out.println("Double ended queue is empty");
        return true;
    }
    else
    {
        System.out.println("Double ended queue is not empty");
        return false;
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