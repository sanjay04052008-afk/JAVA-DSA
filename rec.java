import java.applet.*;
import java.awt.*;
public class rec extends Applet
{
    public void paint(Graphics g)
    {
        Color C=new Color(255,0,0);
        g.setColor(C);
        g.fillRect(100,100,200,100);
    }
}
/*<applet
code="rec.class"
width=400
height=400>
</applet> */