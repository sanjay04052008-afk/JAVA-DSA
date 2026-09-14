import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class d extends Applet implements ActionListener
{
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq;

    public void init()
    {
        setLayout(new FlowLayout());

        t1 = new TextField(20);
        add(t1);

        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");

        badd=new Button("+");
        bsub=new Button("-");
        bmul=new Button("*");
        bdiv=new Button("/");
        beq=new Button("=");

        add(b7); add(b8); add(b9); add(badd);
        add(b4); add(b5); add(b6); add(bsub);
        add(b1); add(b2); add(b3); add(bmul);
        add(b0); add(beq); add(bdiv);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
        t1.setText(t1.getText() + s);
    }
}
/*<applet code="pop.class"
width="400"
height="400">
</applet> */
        