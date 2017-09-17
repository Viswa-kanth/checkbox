
package Swing1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


public class UserInput
{
  public static void main(String[] args)
  {
    RadioDemo r = new RadioDemo();  
  }
}
    class RadioDemo extends JFrame
{
JTextField t1;
JRadioButton r1,r2;
JButton b;
JLabel l;
JCheckBox c1,c2;
public RadioDemo()
{
t1 = new JTextField(15);
r1 = new JRadioButton("male");
r2 = new JRadioButton("female");
b = new JButton("OK");
l = new JLabel("Greeting");
c1 = new JCheckBox("learning");
c2 = new JCheckBox("Teaching");
ButtonGroup bg = new ButtonGroup();
bg.add(r1);
bg.add(r2);



add(t1);
add(r1);
add(r2);
add(b);
add(l);
add(c1);
add(c2);

c1.addItemListener(new ItemListener()
{
    public void itemStateChanged(ItemEvent e)
    {
        System.out.println("Teaching");
    }
});
    
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String name = t1.getText();
if(r1.isSelected())
{
 name = "Mr. " + name;
}
else
{
 name = "Ms. " + name;
}
if(c1.isSelected())
{
    name = name + "learning";
    }
if(c2.isSelected())
{
    name = name + "Teaching";
}
l.setText(name);
}
});

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    
