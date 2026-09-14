import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class i extends Applet implements ActionListener
{
    Checkbox red, blue, green;
    TextField t1;
    Button b1;

    public void init()
    {
        red = new Checkbox("Red");
        blue = new Checkbox("Blue");
        green = new Checkbox("Green");

        t1 = new TextField(20);
        b1 = new Button("Submit");

        b1.addActionListener(this);

        add(red);
        add(blue);
        add(green);
        add(b1);
        add(t1);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String msg = "";

        if(red.getState())
            msg = "Red";

        if(blue.getState())
            msg = "Blue";

        if(green.getState())
            msg = "Green";

        t1.setText(msg);
    }
}