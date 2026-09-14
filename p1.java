import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class p1 extends Applet implements ActionListener
{
    TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq;

    int num1,num2,result;
    char op;

    public void init()
    {
        setLayout(new GridLayout(5,4));   // mobile style layout

        t1 = new TextField();
        add(t1);

        b7=new Button("7"); b8=new Button("8"); b9=new Button("9"); badd=new Button("+");
        b4=new Button("4"); b5=new Button("5"); b6=new Button("6"); bsub=new Button("-");
        b1=new Button("1"); b2=new Button("2"); b3=new Button("3"); bmul=new Button("*");
        b0=new Button("0"); beq=new Button("="); bdiv=new Button("/");

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
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        beq.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();

        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
        {
            num1 = Integer.parseInt(t1.getText());
            op = s.charAt(0);
            t1.setText("");
        }
        else if(s.equals("="))
        {
            num2 = Integer.parseInt(t1.getText());

            if(op=='+') result = num1 + num2;
            if(op=='-') result = num1 - num2;
            if(op=='*') result = num1 * num2;
            if(op=='/') result = num1 / num2;

            t1.setText(String.valueOf(result));
        }
        else
        {
            t1.setText(t1.getText()+s);
        }
    }
}

/*
<applet code="p1.class" width=300 height=300>
</applet>
*/