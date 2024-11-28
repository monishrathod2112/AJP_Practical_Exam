import java.awt.*; 
public class Practical_1
{
public static void main(String args[])
{
Frame f = new Frame("Practical No.1 by Monish");                 
f.setSize(500, 400);
f.setLayout(null);
Label nameLabel = new Label("Student Name:"); 
nameLabel.setBounds(50, 50,100, 30);
TextField name = new TextField(); name.setBounds(150, 50, 200, 30);
Label rollNoLabel = new Label("Roll No:"); 
rollNoLabel.setBounds(50, 90, 100, 30); 
TextField rollNo = new TextField(); 
rollNo.setBounds(150, 90, 200, 30);
Label enrollmentLabel = new Label("Enrollment No.:"); 
enrollmentLabel.setBounds(50, 130, 100, 30);
TextField enrollment = new TextField();
enrollment.setBounds(150, 130, 200, 30); 
Label casteLabel = new Label("Caste:");
casteLabel.setBounds(50, 170, 100, 30);
Choice caste = new Choice();
caste.add("VJ");
caste.add("SC/ST");
caste.add("OPEN");
caste.add("NT");
caste.setBounds(150, 170, 200, 30);
Label addressLabel = new Label("Address:"); 
addressLabel.setBounds(50, 210, 100, 30); 
TextArea address = new TextArea(10, 3);
address.setBounds(150, 210, 200, 50);
Label genderLabel = new Label("Gender:");
genderLabel.setBounds(50, 270, 100, 30);
CheckboxGroup checkboxGroup = new CheckboxGroup();
Checkbox male = new Checkbox("Male", false, checkboxGroup);
male.setBounds(150, 270, 100, 30);
Checkbox female = new Checkbox("Female", false, checkboxGroup); 
female.setBounds(250, 270, 100, 30);
Button submit = new Button("Submit"); 
submit.setBounds(200, 320, 100, 30); 
f.add(nameLabel);
f.add(name);
f.add(rollNoLabel); 
f.add(rollNo); 
f.add(enrollmentLabel); 
f.add(enrollment); 
f.add(casteLabel); 
f.add(caste); 
f.add(addressLabel);
f.add(address);
f.add(genderLabel);
f.add(male); 
f.add(female);
f.add(submit); 
f.setVisible(true);
}
}
