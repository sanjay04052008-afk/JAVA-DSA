import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener
{
    TextField t;
    Button b1,b2,b3,b4,b5;
    int a,b,result;
    char op;

    Calc()
    {
        t = new TextField();
        t.setBounds(50,50,200,30);
        add(t);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("=");

        b1.setBounds(50,100,40,40);
        b2.setBounds(100,100,40,40);
        b3.setBounds(150,100,40,40);
        b4.setBounds(200,100,40,40);
        b5.setBounds(250,100,40,40);

        add(b1); add(b2); add(b3); add(b4); add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setSize(350,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            a=Integer.parseInt(t.getText());
            op='+';
            t.setText("");
        }

        if(e.getSource()==b5)
        {
            b=Integer.parseInt(t.getText());

            if(op=='+')
                result=a+b;

            t.setText(String.valueOf(result));
        }
    }

    public static void main(String args[])
    {
        new Calc();
    }
}