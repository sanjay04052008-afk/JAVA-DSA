class mn
{
    void traverse(int a[],int lb,int ub,int ptr)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
    System.out.println(a[ptr]);
    }}
    void merge(int a[],int b[],int lb1,int ub1,int lb2,int ub2,int ptr1,int ptr2)
    {
        int pos=ub1+1;
for(ptr2=lb2;ptr2<=ub2;ptr2++)
{
    a[pos++]=b[ptr2];
}
    }
}
class bag
{
    public static void main(String str[])
    {
        int a[]={11,22,33,0,0,0};
        int b[]={44,55,66};
        mn O1=new mn();
        System.out.println("Before merging:");
        System.out.println("array elements of a:");
        O1.traverse(a,0,2,0);
        System.out.println("array elements of b:");
        O1.traverse(b,0,2,0);
        O1.merge(a,b,0,2,0,2,0,0);
        System.out.println("After merging:");
        O1.traverse(a,0,5,0);
    }
}