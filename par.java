class a1
{
    void traverse(int data[],int link[],int ptr);
    {
        int i=ptr;
        while(i!=111)
{
    System.out.println(data[i]);
    i=link[i];
}
}
}
class aa
{
    public static void main(String str[])
    {
        int data={10,20,30,40};
        int link={1,2,3,111};
        a1 o1=new a1();
        o1.traverse(data,link,0);
    }
}