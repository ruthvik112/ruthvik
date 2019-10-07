import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="color" width=500 height=600>
</applet>*/


public class color extends Applet implements ItemListener
  
{
	CheckboxGroup cbg;
	Checkbox red,blue,green;
	Color c1=new Color(255,0,0);
	Color c2=new Color(0,255,0);
	Color c3=new Color(0,0,255);

	public void init()
	{
		cbg=new CheckboxGroup();
		red=new Checkbox("red",cbg,false);
		blue=new Checkbox("blue",cbg,false);
		green=new Checkbox("green",cbg,false);
		add(red);
		add(blue);
		add(green);
		red.addItemListener(this);
		blue.addItemListener(this);
		green.addItemListener(this);

	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
      String str=cbg.getSelectedCheckbox().getLabel();
	  if(str.equals("red")){
         g.setColor(c1);
		 g.fillRect(200,100,100,100);
	  }
	  if(str.equals("blue")){
		  g.setColor(c3);
	  g.fillRect(200,100,100,100);
	  }
	  if(str.equals("green")){
	     g.setColor(c2);
	  g.fillRect(200,100,100,100);
	  }
	}


	
}
