import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Practical_9 extends JFrame implements KeyListener 
{
    String msg = ""; 

    public Practical_9() 
	{ 
        setTitle("Prcatical No_9 by Monish");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        addKeyListener(this);
        setVisible(true);
    }

    public void keyReleased(KeyEvent k) 
	{
        msg = "Key Released: " + KeyEvent.getKeyText(k.getKeyCode());
        repaint(); 
    }

    public void keyTyped(KeyEvent k) 
	{
        msg = "Key Typed: " + k.getKeyChar();
        repaint();
    }

    public void keyPressed(KeyEvent k) {
        msg = "Key Pressed: " + KeyEvent.getKeyText(k.getKeyCode());
        repaint();
    }

    public void paint(Graphics g) 
	{
        super.paint(g); 
        g.drawString(msg, 50, 100); 
    }

    public static void main(String[] args) 
	{
        new Practical_9(); 
    }
}
