import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class c extends Frame
{
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
public void init()
{
TextField t1=new TextField(25);
add(t1);
Button b1=new Button("9");
Button b2=new Button("8");
Button b3=new Button("7");
Button b4=new Button("6");
Button b5=new Button("5");
Button b6=new Button("4");
Button b7=new Button("3");
Button b8=new Button("2");
Button b9=new Button("1");
Button b0=new Button("0");
Button b11=new Button("+");
Button b12=new Button("-");
Button b13=new Button("*");
Button b14=new Button("/");
Button b15=new Button("=");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
}
public static void main(String str[])
{
t1.setText("0");
}
}
