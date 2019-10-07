import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="first" width=300 height=500>
</applet>*/


public  class first extends Applet implements ActionListener
{
	String s;
	Button b1;
	public void init(){
		b1=new Button("first");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		s="first";
		g.drawString(s,6,100);
	}
}
