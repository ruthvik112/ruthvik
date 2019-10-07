import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="cal" width=500 height=600>
</applet>*/


public class cal extends Applet implements ActionListener
{
	String str="";
	TextField first,sec,res;
	Button add,sub,mul,div;
	public void init()
	{
        Label firstp=new Label("first");
		Label secp=new Label("second");
		Label resp=new Label("result");
		first=new TextField(15);
		sec=new TextField(15);
		res=new TextField(15);
		add=new Button("add");
		sub=new Button("sub");
		mul=new Button("mul");
		div=new Button("div");
		add(firstp);
		add(first);
		add(secp);
		add(sec);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(resp);
		add(res);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);


	}
	public void actionPerformed(ActionEvent ae)
	{
		 str=ae.getActionCommand();
		 repaint();
	}
	public void paint(Graphics g)
	{
		
     String one=first.getText();
	 String two=sec.getText();
	 int a=Integer.parseInt(one);
	 int b=Integer.parseInt(two);
	 int c=0;
	 


		if(str=="add")
			c=a+b;
		if(str=="sub")
			c=a-b;
		if(str=="mul")
			c=a*b;
		if(str=="div")
			c=a/b;
      String k=Integer.toString(c);
	  res.setText(k);
	}
			

}
