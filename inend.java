class a
{
    void traverse(int data[],int link[],int ptr)
    {
        while (ptr!=111) {
            System.out.println(ptr+"\t"+data[ptr]+"\t"+link[ptr]);
            ptr=link[ptr];
        }
    }
    void insert(int data[],int link[],int ptr,int nndata,int nnaddress)
{
        while(link[ptr]!=111)
            {
                ptr=link[ptr];
            }
        data[nnaddress]=nndata;
        link[nnaddress]=3;
        link[2]=nnaddress;
    }
}
class inbef
{
public static void main(String[] str)
 {
int data[]=new int[100];
int link[]=new int[100];
data[1]=10;  data[2]=20;data[3]=30;data[4]=40;
link[1]=2;link[2]=3;link[3]=4;link[4]=111;
a pot=new a();
System.out.println("Before insertion :");
System.out.println("Index\tdata\tlink");
pot.traverse(data,link,1);
pot.insert(data,link,1,50,17);
System.out.println("After insertion :");
System.out.println("Index\tdata\tlink");
pot.traverse(data,link,1);
 }
}