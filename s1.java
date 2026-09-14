class node
{
int data;
node link;
node(int nd)
{
this.data=nd;
this.link=null;}
}
class xx
{
void traverse(node ptr)
{
while(ptr!=111)
{
System.out.println(ptr.data);
if(ptr.link!=111)
{
System.out.println("--->");
}
ptr=ptr.link;
}
}
void insert(node element,node ptr)
{
while(element!=111)
{
System.out.println(ptr.data);
if(ptr.link!=null)
{
System.out.println("---->");
ptr=ptr.link;
}
}
}
}
class yy
{
public static void main(String str[])
{
node element=new node(11);
ptr.link=new node(22);
ptr.link.link=new node(33);
ptr.link.link.link=new node(44);
xx o1=new xx();
o1.traverse(ptr);
o1.insert(55,ptr);
}
}
