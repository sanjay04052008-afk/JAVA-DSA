class node
{
    int data;
    node prev;
    node next;
    node(int data)
    {
        this.data=data;
this.next=null;
this.prev=null;
    }
}
class no
{
    void traverse(node head)
    {
        while(head!=null)
        {
            System.out.print(head.data);
            if(head.next!=null)
            {
                System.out.print("<----->");
            }
            head=head.next;
        }
    }
    void sort(node head)
    {
        node i,j;
        int a;
        for(i=head;i!=null;i=i.next)
        {
            for(j=i.next;j!=null;j=j.next)
            {
                if(i.data>j.data)
                {
                    a=i.data;
                    i.data=j.data;
                    j.data=a;
                }
            }
        }
    }
}
class note
{
    public static void main(String str[])
    {
        node head=new node(100);
        head.next=new node(11);
        head.next.next=new node(50);
        head.next.next.next=new node(25);
        head.next.next.next.next=new node(90);
        no o1=new no();
        System.out.println("Before Sorting");
        o1.traverse(head);
        o1.sort(head);
        System.out.println("After Sorting");
        o1.traverse(head);
    }
}