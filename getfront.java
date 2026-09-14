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
 void getfront(int deque[],int front)
 {
 if(front!=-1)
 {
  System.out.println("Front ="+front);
  System.out.println("Front element:"+deque[front]);
 }
 }  
}
class getfront
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
        o1.traverse(deque,0,3);
        System.out.println("Getfront operation:");
        o1.getfront(deque,0,3);
      
    }
}