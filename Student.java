class Student
{
public static void main(String str[])
{
    int a,b,c;
    a=753;
    c=0;
    while(a>0)
    {
        b=a%10;
        a=a/10;
        c=c+b;
        
    }
    System.out.println(c);
}
}