class ze
{
    int a,b,c;
    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
    }
}
class ui
{
    public static void main(String str[])
    {
        ze o1=new ze();
        o1.add();
        System.out.println(o1.b);
    }
}