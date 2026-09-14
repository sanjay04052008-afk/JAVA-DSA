class h
{
    void traverse(int data[],int link[],int ptr)
    {
        int i=ptr;
        while(i!=111)
        {
            System.out.print(data[i]);
            i=link[i];
        }
    }

void insert(int data[],int link[],int pos,int element,int newnode)
{
    data[newnode]=element;
    link[newnode]=link[pos];
    link[pos]=newnode;
}
}
class hp
{
    public static void main(String str[])
    {
        int data[]={54,76,86,136,148,75};
        int link[]={2,3,7,9,13,111};
        int ptr=0;
        System.out.println("Before Insertion : ");
        o1.traverse(data,link,ptr);
        o1.insert(data,link,2,100,4);
        System.out.println("After insertion :");
        o1.traverse(data,link,ptr);
    }
}