import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class root extends Applet implements ActionListener
{

TextField t1,t2,t3;
Button b1;

public void init()
{
Label l1 = new Label("First Number");
Label l2 = new Label("Second Number");

t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);

b1 = new Button("Add");

add(l1);
add(t1);

add(l2);
add(t2);

add(b1);
add(t3);

b1.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
int a,b,c;

a = Integer.parseInt(t1.getText());
b = Integer.parseInt(t2.getText());

c = a + b;

t3.setText(String.valueOf(c));
}

}