import java.applet.*;
import java.awt.*;
public class app extends Applet
{
    String s1;
    public void init()
    {
        s1="Sanjay";
    }
    public void paint(Graphics g)
    {
        g.drawString(s1,100,100);
    }
}
/*
<applet
code="app.class"
height="400"
width="400">
</applet> */