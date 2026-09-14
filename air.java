
 import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class air extends Applet implements ItemListener
{
    Checkbox c1,c2,c3;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    public void init()
    {
        c1=new Checkbox("animals");
        c2=new Checkbox("colour");
        c3=new Checkbox("birds");
        t1=new TextField(15);
        t2=new TextField(15);
        t3=new TextField(15);
        t4=new TextField(15);
        t5=new TextField(15);
        t6=new TextField(15);
        t7=new TextField(15);
        t8=new TextField(15);
        t9=new TextField(15);
        add(t1);
        add(t2);
        add(t3);
       add(c1);

      c1.addItemListener(this);


           add(t4);
        add(t5);
        add(t6);
add(c2);
c2.addItemListener(this);


               add(t7);
        add(t8);
        add(t9);
add(c3);
c3.addItemListener(this);


          }
        public void itemStateChanged(ItemEvent ie)
    {
        t1.setText("Tiger");
         t2.setText("Lion"); 
         t3.setText("Cheetah");
add(c1);
                t4.setText("red");
           t5.setText("green");
            t6.setText("blue");
add(c2);
            
             t7.setText("crow");
              t8.setText("parrot");
               t9.setText("peacock");
add(c3);

c3.addItemListener(this);
              }
}
/*<applet code="air.class"
width="400"
height="400">
</applet> */
        