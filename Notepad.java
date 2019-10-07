import java.awt.*;
import java.awt.event.*;
public class NotepadLayout extends Frame implements WindowListener 
{
  MenuBar mb = new MenuBar();
  Menu f1 = new Menu("File");
  Menu f2 = new Menu("Edit");
  Menu f3 = new Menu("Help");
  MenuItem a1 = new MenuItem("N e w");
  MenuItem a2 = new MenuItem("O p e n");
  MenuItem a3 = new MenuItem("S a v e");
  MenuItem a4 = new MenuItem("E x i t");
  MenuItem a5 = new MenuItem("C u t");
  MenuItem a6 = new MenuItem("C o p y ");
  MenuItem a7 = new MenuItem("P a s t e ");
  MenuItem a8= new MenuItem("S e l e c t  A l l ");
  MenuItem a9 = new MenuItem("H e l p   T o p i c");
  TextArea ta = new TextArea();  
  NotepadLayout()
  {
    setTitle("Notepad developed by ............");
    f1.add(a1);
    f1.addSeparator();
    f1.add(a2);
    f1.addSeparator();
    f1.add(a3);
    f1.addSeparator();
    f1.add(a4);
    f2.add(a5);
    f2.addSeparator();
    f2.add(a6);
    f2.addSeparator();
    f2.add(a7);
    f2.addSeparator();
    f2.add(a8);
    f3.add(a9);
    mb.add(f1);
    mb.add(f2);
    mb.add(f3);
    setMenuBar(mb);
    ta.setFont(new Font("Courier New",1,16));
    add(ta);
    setSize(400,300);
    addWindowListener(this);
    show();
  }
  public void windowOpened(WindowEvent e)
  {
     System.out.println("Window Opened");
  }
  public void windowClosing(WindowEvent e)
  {
     System.out.println("Window Closing");
     hide();
  }
  public void windowClosed(WindowEvent e)
  {
     System.out.println("Window Closed");
  }
  public void windowActivated(WindowEvent e)
  {
     System.out.println("Window Activated");
  }
  public void windowDeactivated(WindowEvent e)
  {
     System.out.println("Window Dectivated");
  }

  public void windowIconified(WindowEvent e)
  {
     System.out.println("Window Minimize");
  }
  public void windowDeiconified(WindowEvent e)
  {
     System.out.println("Window Maximize");
  }
  public static void main(String aa[])
  {
     NotepadLayout n = new NotepadLayout();
  }
}
