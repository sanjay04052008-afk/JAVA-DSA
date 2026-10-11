class t
{
    void traverse(int a[],int lb,int ub,int ptr)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
            System.out.println(a[ptr]);
        }
    }
}
class lineararraytraverse
{
    public static void main(String str[])
    {
        int a[]={10,20,30,40};
        t o1=new t();
        o1.traverse(a,0,3,0);

    }
}