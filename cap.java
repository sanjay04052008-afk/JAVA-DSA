import java.util.*;
class cap
{
    public static void main(String str[])
    {
        Stack<Integer> st=new Stack<>();
        st.push(100);
        st.push(200);
        st.push(500);
        st.push(700);
        st.push(1000);
        System.out.println("My stack:");
        System.out.println(st);
         System.out.println("The top elements:"+st.peek());
          System.out.println("Elements removed:"+st.pop());
           System.out.println("stack after pop");
            System.out.println(st);
             System.out.println("empty operation:"+st.empty());
              System.out.println("Search elemnt:"+st.search(700));
               System.out.println("Size of the stack "+st.size());
            st.clear();
             System.out.println(st);

    }
}