import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.WindowListener;
import java.awt.FlowLayout;
 
public class Practical_12  extends WindowAdapter
{
    JFrame f ;
    JLabel l ;
    Practical_12()
    {
        f = new JFrame();
        f.setVisible(true);                    
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.addWindowListener(this);
        f.addWindowFocusListener(this);
    }
 
    public void windowLostFocus(WindowEvent we)
    {
        l = new JLabel("Window Lost Focus");
        f.remove(l);
        f.add(l);
    }
    public void windowOpened(java.awt.event.WindowEvent we)
    {
        l = new JLabel("Window Opened");
        f.remove(l);
        f.add(l);
    }
 
    public void windowActivated(java.awt.event.WindowEvent we)
    {
        l = new JLabel("Window Activated");
        f.remove(l);
        f.add(l);
    }
    public void windowDeactivated(java.awt.event.WindowEvent we)
    {
        l = new JLabel("Window Deactivated");
        f.remove(l);
        f.add(l);
    }
 
    public void windowGainedFocus(java.awt.event.WindowEvent we)
    {
        l = new JLabel("Window Gained Focus");
        f.remove(l);
        f.add(l);
    }
 
 
    public static void main(String[] args) 
    {
        Practical_12 P12 = new Practical_12();
    }
}