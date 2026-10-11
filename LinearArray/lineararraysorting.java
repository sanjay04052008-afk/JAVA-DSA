class a
{
    
    void traverse(int a[],int lb,int ub,int ptr)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
    System.out.println(a[ptr]);
    }
}
void sort(int a[],int lb,int ub,int ptr)
{
    for(int i=lb;i<ub;i++)
    {
        for(int j=lb;j<ub;j++)
        {
            if(a[j]>a[j+1])
            {
                ptr=a[j];
                a[j]=a[j+1];
                a[j+1]=ptr;
                
            }
        }
    }
}
}
class lineararraysorting
{
    public static void main(String str[])
    {
        int a[]={40,37,65,13,26,50};
        a o1=new a();
        System.out.println("Before sorting:");
        o1.traverse(a,0,5,0);
        o1.sort(a,0,5,0);
        System.out.println("After Sorting:");
        o1.traverse(a,0,5,0);
    }
}