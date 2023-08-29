import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame{
JLabel l1,l2;
JButton b1,b2,b3,b4;
JTextField t1,t2;
Calculator (){
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(null);
l1=new JLabel("Simple Calculator");
l1.setBounds(90,10,300,30);
add(l1);
l2= new JLabel("");
l2.setBounds(250,80,100,30);
add(l2);

t1=new JTextField(60);
t2=new JTextField(60);
b1=new JButton("Add");
b2=new JButton("Sub");
b3=new JButton("Mul");
b4=new JButton("Div");

t1.setBounds(100,60,120,30);
t2.setBounds(100,100,120,30);
b1.setBounds(100,140,60,30);
b2.setBounds(100,200,60,30);
b3.setBounds(200,140,60,30);
b4.setBounds(200,200,60,30);

add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
int no1=Integer.parseInt(t1.getText());
int no2=Integer.parseInt(t2.getText());
l2.setText("Sum = "+(no1+no2));
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
int no1=Integer.parseInt(t1.getText());
int no2=Integer.parseInt(t2.getText());
l2.setText("Sub = "+(no1-no2));
}
});

b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
int no1=Integer.parseInt(t1.getText());
int no2=Integer.parseInt(t2.getText());
l2.setText("Prod = "+(no1*no2));

}
});

b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
int no1=Integer.parseInt(t1.getText());
int no2=Integer.parseInt(t2.getText());
l2.setText("Div = "+(no1/no2));
}
});
}
}
class SimpleCalculator{
public static void main(String args[])
{
Calculator c = new Calculator();
c.setBounds(400,400,400,400);
c.setVisible(true);
}
}