import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwapingGame implements ActionListener
{
JFrame jf;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
ImageIcon a,b,c,d,e,f,g,h,i; 
Icon temp;
boolean select1 = false, select2 = false , select3 = false;
boolean select4 = false, select5 = false , select6 = false;
boolean select7 = false, select8 = false , select9 = false;
int count = 0;
SwapingGame()
{
jf = new JFrame("Swaping Game");
b1 = new JButton(); b1.addActionListener(this);
b2 = new JButton(); b2.addActionListener(this);
b3 = new JButton(); b3.addActionListener(this);
b4 = new JButton(); b4.addActionListener(this);
b5 = new JButton(); b5.addActionListener(this);
b6 = new JButton(); b6.addActionListener(this);
b7 = new JButton(); b7.addActionListener(this);
b8 = new JButton(); b8.addActionListener(this);
b9 = new JButton(); b9.addActionListener(this);
a = new ImageIcon("1.jpg");
b = new ImageIcon("2.jpg");
c = new ImageIcon("3.jpg");
d = new ImageIcon("4.jpg");
e = new ImageIcon("5.jpg");
f = new ImageIcon("6.jpg");
g = new ImageIcon("7.jpg");
h = new ImageIcon("8.jpg");
i = new ImageIcon("9.jpg");
b1.setIcon(b);  b2.setIcon(i);  b3.setIcon(f);
b4.setIcon(a);  b5.setIcon(d);  b6.setIcon(h);
b7.setIcon(g);  b8.setIcon(e);  b9.setIcon(c);
jf.setLayout(new GridLayout(3,3));
jf.add(b1); jf.add(b2); jf.add(b3);
jf.add(b4); jf.add(b5); jf.add(b6);
jf.add(b7); jf.add(b8); jf.add(b9);
jf.setSize(233,250);
jf.setResizable(false);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == b1)
{
select1 = true;
select3 = false;
select7 = false;  
if(select2 == true)
{
temp = b1.getIcon();
b1.setIcon(b2.getIcon());
b2.setIcon(temp);
select2 = false;
select1 = false;  
}     
if(select4 == true)
{
temp = b1.getIcon();
b1.setIcon(b4.getIcon());
b4.setIcon(temp);
select4 = false;
select1 = false;  
}
}
if(e.getSource() == b2)
{
select2 = true;
select7 = false;
select6 = false;   
if(select1 == true)
{
temp = b1.getIcon();
b1.setIcon(b2.getIcon());
b2.setIcon(temp);
select1=false;
select2=false;
}
if(select3 == true)
{
temp = b2.getIcon();
b2.setIcon(b3.getIcon());
b3.setIcon(temp);
select2 = false;
select3 = false; 
select1 = false;  
}      
if(select5 == true)
{
temp = b2.getIcon();
b2.setIcon(b5.getIcon());
b5.setIcon(temp);
select5 = false;
select2 = false;  
}
}
if(e.getSource() == b3)
{
select3 = true;
select1 = false;
select9 = false;   
if(select2 == true)       
{
temp = b2.getIcon();
b2.setIcon(b3.getIcon());
b3.setIcon(temp);
select3 = false;
select2 = false;   
}
if(select6 == true)
{
temp = b3.getIcon();
b3.setIcon(b6.getIcon());
b6.setIcon(temp);
select6 = false;
select3 = false;  
}
}
if(e.getSource() == b4)
{
select4 = true;
select6 = false;  
select8 = false;
if(select5 == true)
{
temp = b4.getIcon();
b4.setIcon(b5.getIcon());
b5.setIcon(temp);
select5 = false;
select4 = false;  
}
if(select1 == true)
{
temp = b4.getIcon();
b4.setIcon(b1.getIcon());
b1.setIcon(temp);
select7 = false;
select1 = false;
select4 = false; 
}
if(select7 == true)
{
temp = b4.getIcon();
b4.setIcon(b7.getIcon());
b7.setIcon(temp); 
select7 = false;
select1 = false;
select4 = false;
}     
}
if(e.getSource() == b5)
{
select5 = true;
select1 = false; select3 = false; select7 = false; select9 = false;  
if(select4 == true)
{
temp = b4.getIcon();
b4.setIcon(b5.getIcon());
b5.setIcon(temp);
select4=false;
select5=false;
}
if(select6 == true)
{
temp = b5.getIcon();
b5.setIcon(b6.getIcon());
b6.setIcon(temp);
select5 = false;
select6 = false; 
select4 = false;  
}
if(select2 == true)
{
temp = b5.getIcon();
b5.setIcon(b2.getIcon());
b2.setIcon(temp);
select8 = false;
select2 = false;
select5 = false; 
}
if(select8 == true)
{
temp = b5.getIcon();
b5.setIcon(b8.getIcon());
b8.setIcon(temp); 
select8 = false;
select2 = false;
select5 = false;
}     
}
if(e.getSource() == b6)
{
select6 = true;
select4 = false;
select2 = false; 
if(select5 == true)       
{
temp = b5.getIcon();
b5.setIcon(b6.getIcon());
b6.setIcon(temp);
select6 = false;
select5 = false;   
}
if(select3 == true)
{
temp = b6.getIcon();
b6.setIcon(b3.getIcon());
b3.setIcon(temp);
select9 = false;
select3 = false;
select6 = false; 
}
if(select9 == true)
{
temp = b6.getIcon();
b6.setIcon(b9.getIcon());
b9.setIcon(temp); 
select9 = false;
select3 = false;
select6 = false;
}           
} 
if(e.getSource() == b7)
{
select7 = true;
select9 = false;  
select1 = false;
if(select8 == true)
{
temp = b7.getIcon();
b7.setIcon(b8.getIcon());
b8.setIcon(temp);
select8 = false;
select7 = false;  
}
if(select4 == true)
{
temp = b4.getIcon();
b4.setIcon(b7.getIcon());
b7.setIcon(temp); 
select7 = false;
select4 = false;     
}
}
if(e.getSource() == b8)
{
select8 = true;
select2 = false;
select4 = false;
if(select7 == true)
{
temp = b7.getIcon();
b7.setIcon(b8.getIcon());
b8.setIcon(temp);
select7=false;
select8=false;
}
if(select9 == true)
{
temp = b8.getIcon();
b8.setIcon(b9.getIcon());
b9.setIcon(temp);
select8 = false;
select9 = false; 
select7 = false;  
}
if(select5 == true)
{
temp = b5.getIcon();
b5.setIcon(b8.getIcon());
b8.setIcon(temp); 
select8 = false;
select5 = false;     
}      
}
if(e.getSource() == b9)
{
select9 = true;
select7 = false;
select3 = false; 
if(select8 == true)       
{
temp = b8.getIcon();
b8.setIcon(b9.getIcon());
b9.setIcon(temp);
select9 = false;
select8 = false;   
}
if(select6 == true)
{
temp = b6.getIcon();
b6.setIcon(b9.getIcon());
b9.setIcon(temp); 
select9 = false;
select6 = false;     
}       
}
}
public static void main(String args[])
{
new SwapingGame();
}
}
