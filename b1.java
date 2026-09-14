import java.awt.*;
class b1 extends Frame
{
    b1()
    {
        Button b1=new Button("Click");
        TextField t1=new TextField(20);
        setLayout(new FlowLayout());
        add(t1);
        add(b1);
    }
}
class b1
{
    public static void main(String str[])
    {
        aa f=new aa();
        f.setTitle("My Frame");
        f.setVisible(true);
        f.setSize(400,400);
    }
}