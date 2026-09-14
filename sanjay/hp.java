class h
{
    void traverse(int data[],int link[],int ptr)
    {
        int i=ptr;
        while(i!=111)
        {
            System.out.print(i+\tdata[i]+\tlink[i]);
            i=link[i];
        }
    }

void insert(int data[],int link[],int ptr,int nna,int newdata,int pna)
{
    int t;
    t=link[pna];
    link[pna]=nna;
    link[nna]=t;
    
}
}
class h1
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
        System.out.println("Before Insertion : ");
        System.out.println("Index\tData\tLink");
        o1.traverse(data,link,ptr);
        o1.insert(data,link,ptr,17,500,1);
        System.out.println("After insertion :");
        System.out.println("Index\tData\tLink")
          o1.traverse(data,link,ptr);
    }
}