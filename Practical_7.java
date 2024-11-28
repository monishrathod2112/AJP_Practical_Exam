import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode; 
public class Practical_7
{
JFrame f; 
Practical_7()
{
f=new JFrame();
DefaultMutableTreeNode Animal=new DefaultMutableTreeNode("Animal"); 
DefaultMutableTreeNode Birds=new DefaultMutableTreeNode("Birds"); 
DefaultMutableTreeNode Fish=new DefaultMutableTreeNode("Fish"); 
Animal.add(Birds);
Animal.add(Fish);
DefaultMutableTreeNode Parrot=new DefaultMutableTreeNode("Parrot"); 
DefaultMutableTreeNode Owl=new DefaultMutableTreeNode("Owl"); 
DefaultMutableTreeNode Crows=new DefaultMutableTreeNode("Crows"); 
DefaultMutableTreeNode Peacock=new DefaultMutableTreeNode("Peacock"); 
Birds.add(Parrot); 
Birds.add(Owl); 
Birds.add(Crows); 
Birds.add(Peacock); 
JTree jt=new JTree(Animal);
f.add(jt); 
f.setSize(200,200); 
f.setVisible(true);
f.setTitle("Practical No.7 by Monish");
}
public static void main(String[] args)
{
new Practical_7();
}
}
