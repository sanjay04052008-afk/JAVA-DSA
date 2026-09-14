import java.awt.*;
class z extends Frame
{
z()
{
Button b=new Button("Click");
TextField t= new TextField(20);
setLayout(new FlowLayout());
t.setText("Stay Calm");
add(t);
add(b);

}
}
class z1
{
public static void main(String str[])
{
z f1=new z();
f1.setTitle("Naveen");
f1.setVisible(true);
f1.setSize(400,400);
}
}