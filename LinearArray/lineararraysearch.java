    class pen
    {
    void traverse(int a[],int lb,int ub,int ptr)
    {
        for(ptr=lb;ptr<=ub;ptr++)
        {
            System.out.println(a[ptr]);
        }
    }
    void search(int a[], int lb, int ub, int val) {
        int ptr;
        for (ptr = lb; ptr <= ub; ptr++) {
            if (val == a[ptr]) {
                System.out.println("Element "+20+" is found in this position " + ptr);
                break;
            } else {
                continue;
            }
        }
        if (ptr > ub) {
            System.out.println("Element is not found");
        }
    }
}

class lineararraysearch {
    public static void main(String str[]) {
        int a[] = {10, 20, 30, 40};
        pen o1 = new pen();
        System.out.println("Traversing the elements:");
        o1.traverse(a,0,3,0);
        o1.search(a, 0, 3, 20);
    }
}