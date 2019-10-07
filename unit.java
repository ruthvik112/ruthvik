import java.applet.*;
import java.awt.*;
import java.awt.event.*;

 class unit extends Applet implements ItemListener
{
            CheckboxGroup cbg;
            Checkbox mi,mm,km,m,ft,cm
public unit()
{
          cbg=new CheckboxGroup();
           mi=new Checkbox("mi",cbg,false);
		   mm=new Checkbox("mm",cbg,false);
		   km=new Checkbox("km",cbg,false);
		   ft=new Checkbox("ft",cbg,false);
		   m=new Checkbox("m",cbg,false);

           
            add(cbg);
			add(mm);
			add(mi);
			add(m);
			add(km);
		    add(ft);

           mi.addItemListener(this);
		   mm.addItemListener(this);
		   km.addItemListener(this);
		   m.addItemListener(this);
		   ft.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
	{
	repaint();
	}
	public void paint(Graphics g)
	{
		String s=cbg.getSelectedCheckbox().getlabel();
		if(s.equals("


public static void main(String s[])
{
            mymenu mn=new mymenu();
             mn.setSize(new Dimension(500,500));
            mn.setTitle("Menu Bar");
            mn.setVisible(true);
}
}