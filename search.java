class an
{
void searching(int data[],int link[],int ptr,int selement)
{
int i;
for(i=ptr;i!=111;i=link[i])
{
    if(selement==data[i])
    {
        System.out.println("Search element is found in pos: "+i);
        break;
    }
}
    if(i==111)
{
    System.out.println("Search element is not found");
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
o1.searching(data,link,ptr,40);
}
}

