class a
{
    void t1(int data[],int link[],int ptr)
    {
        int i=ptr;
        while(i!=111)
        {
            System.out.println(i+"\t"+data[i]+"\t"+link[i]);
            i=link[i];

        }
    }
    void t2(int data1[],int link1[],int ptr)
    {
        int j=ptr;
        while(j!=111)
        {
            System.out.println(j+"\t"+data1[j]+"\t"+link1[j]);
            j=link1[j];

        }
    }
}
class ss
{
public static void main(String str[])
{
int data[]={10,20,30,40};
int link[]={1,2,3,111};
int data1[]={50,60,80,90};
int link1[]={5,12,17,111};
a o1=new a();
System.out.println("Index\tdata\tlink");
o1.t1(data,link,1);
System.out.println("Index\tdata1\tlink1");
o1.t2(data1,link1,5);
}
}