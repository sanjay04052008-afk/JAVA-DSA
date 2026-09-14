class pen
{
    void search(int a[],int lb,int ub,int ptr,int val)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
          if(val == a[ptr])
            ptr++;
        {
            System.out.println("Element is found");
        }
        else
        {
            System.out.println("Element is not found");
        }
        }
         }
        }
    

class em
{
    public static void main(String str[])
    {
        int a[]={10,20,30,40};
        pen o1=new pen();
        System.out.println("Search element is found");
        o1.search(a,0,3,0,20);

    }
}