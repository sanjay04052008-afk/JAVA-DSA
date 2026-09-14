import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class xx extends Applet implements AdjustmentListener
{
TextField t;
Scrollbar s;
public void init()
{
t=new TextField(10);
s=new Scrollbar(Scrollbar.VERTICAL);
add(t);
add(s);
s.addAdjustmentListener(this);
}

public void adjustmentValueChanged(AdjustmentEvent ade)
{
int a=s.getValue();
t.setText(" "+a);
}
}
/*<applet
code = "xx.class"
height=400
width=400>
</applet>*/