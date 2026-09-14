import java.awt.*;
class z extends Frame
{
z()
{
Button b1=new Button("Click");
TextField t1=new TextField(29);
setLayout(new FlowLayout());
add(t1);
add(b1);
}
}
class bb
{
public static void main(String str[])
{
z f=new z();
f.setTitle("My Frame");
f.setVisible(true);
f.setSize(400,400);
}
}