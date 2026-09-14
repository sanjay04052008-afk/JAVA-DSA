class aa
{

    void traverse(int data[],int link[],int ptr)
    {
        int i=ptr;
        while(i!=111)
        {
            System.out.println(data[i]);
            i=link[i];
        
        }
    }


void insert(int data[], int link[], int pos, int element, int new_node)
{
    data[new_node] = element;
    link[new_node] = link[pos];
    link[pos] = new_node;
}
}

class Par
{
    public static void main(String args[])
    {
        int data[] = {10, 20, 30, 40, 50};
        int link[] = {1, 2, 3, 11, -1};
        int ptr = 0;

        S.O.P("Before insertion");
        traverse(data, link, ptr);

        insert(data, link, 2, 100, 4);

        S.O.P("After insertion");
        traverse(data, link, ptr);
    }
}