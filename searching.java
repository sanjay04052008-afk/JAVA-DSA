class a
{
    void traverse(int data[],int link[],int ptr)
    {
        int i;
        while (i!=111) {
            System.out.println(i+"\t"+data[i]+"\t"+link[i]);
            i=link[i];
        }
    }
    void insertint data[],int link[],int nndata,int nnaddress)
    {
        int t;
        data[nnaddress]=nndata;
        link[nnaddress]=111;
        link[t]=nnaddress;
    }
}
class inend
{
public static void main(String[] str)
 {
int data[]=new int[100];
int link[]=new int[100];
data[1]=10;data[2]=20;data[3]=30;data[4]=40;
link[1]=2;link[2]=3;link[3]=4;link[4]=111;
a o1=new a();
System.out.println("Before insertion :");
System.out.println("Index\tdata\tlink");
o1.traverse(data,link,1);
o1.insert(data,link,50,17);
System.out.println("After insertion :");
System.out.println("Index\tdata\tlink");
o1.traverse(data,link,2);