import java.awt.*;    
public class Practical_3
{
public static void main(String args[])
{
Frame f=new Frame("Practical No.3 by Monish");
f.add(new Button("1"));
f.add(new Button("2"));
f.add(new Button("3"));
f.add(new Button("+"));
f.add(new Button("4"));
f.add(new Button("5"));
f.add(new Button("6"));
f.add(new Button("-"));
f.add(new Button("7"));
f.add(new Button("8"));
f.add(new Button("9"));
f.add(new Button("/"));
f.add(new Button("0"));
f.add(new Button("*"));
f.add(new Button("="));
f.add(new Button("."));
f.setLayout(new GridLayout(4,3)); 
f.setSize(400,400); 
f.setVisible(true);
}
}
