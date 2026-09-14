class paris
{
    void traverse(int stack[],int top)
    {
        while(top>=0)
        {
         System.out.println(stack[top]);
         top=top-1;
        }
    }
    void push(int stack[],int top,int data,int max)
    {
        if(top==max)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top=top+1;
            stack[top]=data;
        }
    }
    void pop(int stack[],int top,int data)
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
        }
        else{
             data=stack[top];
            top=top-1;
        }
        }
        void peek(int stack[],int top)
        {
         if(top==-1)
         {
            System.out.println("Stack underflow");
         }
         else{
            System.out.println(stack[top]);
         }
         }
         boolean isEmpty(int stack[],int top)
         {
            if(top==-1)
            {
                return true;
            }
            else
            {
                return false;
            }
         }
         boolean isFull(int stack[],int top,int max)
         {
            if(top==max)
            {
                return true;
            }
            else
            {
                return false;
            }
         }
        }
class  stackall
{
    public static void main(String str[])
    {
        int stack[]=new int[100];
        paris O1=new paris();
         
        stack[0]=10;
        stack[1]=20;
        stack[2]=30;
        stack[3]=40;
        
        System.out.println("Before push operation:");
        O1.traverse(stack,3);

        O1.push(stack,3,500,10);

        System.out.println("After push operation:");
        O1.traverse(stack,4);

        System.out.println("Before pop operation:");
        O1.traverse(stack,4);
        O1.pop(stack,4,500);
        System.out.println("After pop operation:");
        O1.traverse(stack,3);

        System.out.println("peek operation:");
        O1.peek(stack,3);

        System.out.println("isEmpty operation:");
        System.out.println(O1.isEmpty(stack,3));

        System.out.println("isFull operation:");
        System.out.println(O1.isFull(stack,3,10));
    }
}