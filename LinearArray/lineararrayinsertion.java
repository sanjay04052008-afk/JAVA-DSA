class in
{
    void traverse(int a[],int lb,int ub,int ptr)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
            System.out.println(a[ptr]);
        }
    }
    void insert(int a[],int lb,int ub,int ptr,int pos,int value)
    {
        for(ptr=ub;ptr>=pos;ptr--)
        {
            a[ptr+1]=a[ptr];
        }
        a[pos]=value;
    }
}
class lineararrayinsertion
{
    public static void main(String str[])
    {
        int a[]=new int[100];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        in o1=new in();
        System.out.println("Before insertion:");
        o1.traverse(a,0,3,0);
        o1.insert(a,0,3,0,4,100);
        System.out.println("After insertion:");
        o1.traverse(a,0,4,0);
    }
}