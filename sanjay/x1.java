import java.awt.*;
import java.awt.event.ActionEvent;
public class x1 extends implements ActionListener
{
    x1()
    {
        Button b1=new Button("Click");
        TextField t1=new TextField(15);
        TextField t2=new TextField(10);
        TextField t3=new TextField(20);
        Label l1=new Label("First Name");
        Label l2=new Label("Last Name");
        Label l3=new Label("Full Name");
        add(b1);
        add(t1);
        add(t2);
        add(t3);

    }
    public void actionPerformed(ActionEvent ae)
    {
        t1.setText("Raj");
        t2.setText("Kumar");
        t3.setText("Raj Kumar");
        f1.setSize(400,400);
    }
}