class a
{
void traverse(int data[],int link[],int ptr)
{
int i=ptr;
while(i!=111)
{
System.out.println(i+"\t"+data[i]+"\t"+link[i]);
i=link[i];
}
}
void searching(int data[],int link[],int ptr,int selement)
{
for(link=ptr;link<=111,link++)
{
    if(selement==data[link])
    {
        System.out.println("Sesrch element is found");
    }
    else
    {
        System.out.println("Search element is not found");
    }
}
}
}
class search
{
public static void main(String str[])
{
int data[]=new int[100];
int link[]=new int[100];
data[1]=10;data[2]=20;data[3]=30;data[4]=40;
link[1]=2;link[2]=3;link[3]=4;link[4]=111;
a o1=new a();
int ptr=1;
System.out.println("Before Deletion :");
System.out.println("Index\tdata\tlink");
o1.traverse(data,link,ptr);
o1.search(data,link,ptr,20);
System.out.println("After Deletion :");
System.out.println("Index\tdata\tlink");
o1.traverse(data,link,ptr);
}
}

