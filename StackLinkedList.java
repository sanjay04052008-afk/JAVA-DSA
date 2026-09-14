class node
{
    int data;
    node link;
    node(int data)
    {
        this.data = data;
        this.link = null;
    }
}
class Stack
{
    node top = null;
    void push(int element)
    {
        node n1 = new node(element);
        n1.link = top;
        top = n1;
    }
    void pop()
    {
        if(top == null)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            node s = top;
            top = top.link;
            s.link = null;
        }
    }
    void peek()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Peek: " + top.data);
        }
    }
    boolean isEmpty()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
            return true;
        }
        else
        {
            System.out.println("Stack is Not Empty");
            return false;
        }
    }
    boolean isFull()
    {
        int max=20;
        int index=0;
        if(index==max)
        {
        System.out.println("Stack is Full");
        return true;
    }
    else
        {
        System.out.println("Stack is Not Full");
        return false;
    }
}
    void size()
    {
        int index = 0;
        node ptr = top;

        while(ptr != null)
        {
            index++;
            ptr = ptr.link;
        }

        System.out.println("Size: " + index);
    }
    void clear()
    {
        top=null;
    }
    void traverseStack()
    {
        node ptr = top;
        int index=0;
    while(ptr != null)
        {
            System.out.println(ptr.data);
            ptr = ptr.link;
            index++;
        }
         
        if(top != null)
        {
            System.out.println("Top = " +(index-1));
        }
    }
    void traverseList()
    {
        node ptr = top;
        int index=0;
     while(ptr != null)
        {
            System.out.print(ptr.data);
            if(ptr.link != null)
            {
                System.out.print("<----");
            }
         ptr = ptr.link;
         index++;
        }
            System.out.println();
            System.out.println("Top = " +(index));
        }
    }
class StackLinkedList
{
    public static void main(String args[])
    {
        Stack O1 = new Stack();
        O1.push(234);
        O1.push(762);
        O1.push(593);
        O1.push(476);
        O1.push(854);
        O1.push(351);
        System.out.println("My stack:");
        O1.traverseStack();
        System.out.println("\nMy linked list:");
        O1.traverseList();
        System.out.println();
        System.out.println("\nBefore Pop Operation of Stack:");
        O1.traverseStack();
        O1.pop();
        System.out.println("\nAfter Pop Operation of Stack:");
        O1.traverseStack();
        
        System.out.println("\nBefore Pop Operation of Linked List:");
        O1.traverseList();
        O1.pop();
        System.out.println();
        System.out.println("\nAfter Pop Operation of Linked List:");
        O1.traverseList();
        
        System.out.println();
        System.out.println("\nPeek Operation:");
        O1.peek();

        System.out.println("\nEmpty Operation:");
        O1.isEmpty();
        
        System.out.println("\nFull Operation:");
        O1.isFull();
        
        System.out.println("\nSize Operation:");
        O1.size();

        System.out.println("\nclear operation:");
        O1.clear();
        O1.traverseList();
    }
}