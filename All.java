import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class All extends Applet implements ItemListener
{
    Checkbox animals, colours, birds;
    String msg = "";

    public void init()
    {
        animals = new Checkbox("Animals");
        colours = new Checkbox("Colours");
        birds = new Checkbox("Birds");

        add(animals);
        add(colours);
        add(birds);

        animals.addItemListener(this);
        colours.addItemListener(this);
        birds.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(animals.getState())
        {
            msg = "Animals: Dog, Cat, Lion";
        }
        else if(colours.getState())
        {
            msg = "Colours: Red, Blue, Green";
        }
        else if(birds.getState())
        {
            msg = "Birds: Parrot, Peacock, Sparrow";
        }

        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg, 100, 100);
    }
}
/*<applet code="All.class"
width="400"
height="400">
</applet> */
        