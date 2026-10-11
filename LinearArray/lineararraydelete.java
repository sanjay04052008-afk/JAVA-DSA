class del
{
    void traverse(int a[],int lb,int ub,int ptr)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
            System.out.println(a[ptr]);
        }
    }
    void delete(int a[],int lb,int ub,int pos)
    {
        for(int ptr=pos;ptr<=ub;ptr++)
        {
            a[ptr]=a[ptr+1];
        }
    }
}
    class lineararraydelete
    {
        public static void main(String str[])
        {
         int a[]=new int[100];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
       del o1=new del();
       System.out.println("Before deletion:");
       o1.traverse(a,0,3,0);
       o1.delete(a,0,3,1);
       System.out.println("After deletion:");
       o1.traverse(a,0,2,0);
        }
    }