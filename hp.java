class h
{
    void traverse(int data[],int link[],int ptr)
    {
        int i=ptr;
        while(i!=111)
        {
            System.out.print(i+"\t"+data[i]+"\t"+link[i]);
            i=link[i];
        }
    }

void delete(int data[],int link[],int ptr,int pna)
{
    int t;
    t=link[pna];
   link[pna]=link[t];
   
    
}
}
class hp
{
    public static void main(String str[])
    {
        int data[]=new int[100];
        int link[]=new int[100];
        data[5]=54;data[2]=76;data[7]=136;
        data[3]=186;data[9]=148;data[13]=75;
        link[5]=2;link[2]=3;link[3]=7;link[7]=9;
        link[9]=13;link[13]=111;
        h o1=new h();
        int ptr=5;
        System.out.println("Before Deletion : ");
        System.out.println("Index\tdata\tlink");
        o1.traverse(data,link,ptr);
        o1.delete(data,link,ptr,2);
        System.out.println("\nAfter Deletion :");
         System.out.println("Index\tdata\tlink");
          o1.traverse(data,link,ptr);
    }
}