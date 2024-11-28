import java.awt.*; 
import java.awt.event.*; 
public class Practical_5 
{
public static void main(String[] args)
{
Frame f = new Frame(" Practical No.5 by Monish "); 
MenuBar menuBar = new MenuBar();
Menu fileMenu = new Menu("File"); 
Menu editMenu = new Menu("Edit"); 
Menu viewMenu = new Menu("View");
MenuItem newMenuItem = new MenuItem("New");       
MenuItem openMenuItem = new MenuItem("Open"); 
fileMenu.add(newMenuItem); 
fileMenu.add(openMenuItem); 
menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(viewMenu); 
f.setMenuBar(menuBar); 
f.setSize(400,300); 
f.setVisible(true);
}
}
