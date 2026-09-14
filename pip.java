import java.applet.*;
import java.awt.*;
import java.event.*;
public class pip extends Applet implements ActionListener
{
Checkbox red,blue,green;
TextField t1;
Button b1;
public void init()
{
red=new checkbox();
blue=new checkbox();
green=new checkbox();
t1=new textField(20);
b1=new Button("Submit");
b1.addActionListener(this);
add(red);
add(blue);
add(green);
add(b1);
add(t1);
}
public void actionPerformed(ActionEvent ae)
{
red=setText("Red");
blue=setText("Blue");
green=setText("Green");
}
}
/*
<applet
code="pip.class"
height=400
width=400>
</applet>*/

