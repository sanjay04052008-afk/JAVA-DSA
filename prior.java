class Queueitem
{
    int value,priority;
    Queueitem(int v,int p)
    {
        this.value=v;
        this.priority=p;
    }

    void traverse(int Queueitem[],int rear,int front)
    {
        if(rear!=-1)
        {
            System.out.println("Rear = "+ (rear));
        }
        while(rear>=0)
        {
            
            System.out.println(Queueitem[rear]);
            rear=rear-1;
            
        }
         if(front!=-1)
            {

            System.out.println("Front =  "+(front));
        }
    }                 

    void enqueue(int Queueitem[],int rear,int v,int p)
    {
        if(rear==size-1)
        {
           System.out.println("Priority Queue is Full");
        }
        else
        {
            System.out.println(Queueitem[value]=v);
            System.out.println(Queueitem[priority]=p);
        }
    }
}


class prior
{
    public static void main(String str[])
    {
        Queueitem pq[];
        int size=10;
        pq=new Queueitem[10];
        int rear=2;
        int front=0;
        Queueitem[0]=0;
        
    }
}