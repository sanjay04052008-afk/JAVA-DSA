import java.awt.*;
public class pp extends Frame
{
pp()
{
Button b1=new Button("Add");
Button b2=new Button("Sub");
Button b3=new Button("MUl");
TextField t1=new TextField(10);
TextField t2=new TextField(10);
TextField t3=new TextField(10);
Label l1=new Label("val1");
Label l2=new Label("val2");
Label l3=new Label("Result");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
add(b3);
add(t3);
add(l3);
setLayout(new FlowLayout());
t1.setText("20");
t2.setText("20");
setSize(400,400);
setVisible(true);
}
public static void main(String str[])
{
new pp();
}
}