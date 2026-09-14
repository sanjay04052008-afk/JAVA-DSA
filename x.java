import java.awt.*;
public class x extends Frame implements ActionListener
{
x()
{
Button b1=new Button("Click");
TextField t1=new TextField(15);
TextField t2=new TextField(15);
TextField t3=new TextField(15);
Label l1=new Label("First name");
Label l2=new Label("Last name");
Label l3=new Label("Full name");
add(b1);
add(t1);
add(t2);
add(t3);
}
}
public void actionPerformed(ActionEvent ae)
{
t1.SetText("Raj");
t2.SetText("Kumar");
t3.SetText("Raj Kumar");
f1.SetSize(400,400);
}
}





