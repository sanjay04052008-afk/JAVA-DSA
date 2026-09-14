import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ad extends Applet implements ActionListener
{
    TextField t1, t2, t3;
    Button b;

    public void init()
    {
        Label l1=new Label("First number");
        Label l2=new Label("Second number");
        Label l3=new Label("Result");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);


        add(l1);
        add(t1);
        add(l2);
        add(t2);
	b = new Button("Add");
	add(b);
        add(l3);
        add(t3);
	b.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae)
    {
        int x = Integer.parseInt(t1.getText());
        int y = Integer.parseInt(t2.getText());
        int z =x+y;

        t3.setText(" "+z);
    }
}


/*<applet 
code="ad.class"
width=400
height=400>
</applet> */
