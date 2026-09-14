    class pen
    {

    void search(int a[], int lb, int ub, int val) {
        int ptr;
        for (ptr = lb; ptr <= ub; ptr++) {
            if (val == a[ptr]) {
                System.out.println("Element is found in this position " + ptr);
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

class e {
    public static void main(String str[]) {
        int a[] = {10, 20, 30, 40};
        pen o1 = new pen();
        o1.search(a, 0, 3, 20);
    }
}