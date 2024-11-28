import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical_10A extends JFrame implements MouseListener 
{
    String s = "See your event here";

    public Practical_10A() 
	{
        this.setTitle("Practical No_10A by Monish");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        this.setVisible(true); 
        this.addMouseListener(this); 
    }

    public void paint(Graphics g) 
	{
        super.paint(g);
        g.drawString(s, 100, 100);
    }
   
    public void mouseEntered(MouseEvent me) 
	{
        s = "Mouse Entered";
        repaint();
    }
 
    public void mouseExited(MouseEvent me) 
	{
        s = "Mouse Exited";
        repaint();
    }

    public void mouseClicked(MouseEvent me) 
	{
        s = "Mouse Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent me) 
	{
        s = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent me) 
	{
        s = "Mouse Released";
        repaint();
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(() -> new Practical_10A()); 
    }
}
