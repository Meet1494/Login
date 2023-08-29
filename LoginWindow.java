import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login extends JFrame
{
JLabel l1,l2;
JButton b1,b2;
JTextField t1,t2;

Login(){
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(null);
l1=new JLabel("Login Page !");
l1.setBounds(100,10,300,30);
add(l1);
l2=new JLabel("");
l2.setBounds(200,10,300,30);
add(l2);
 
t1=new JTextField(60);
t2=new JPasswordField(60);
b1=new JButton("Login");
b2=new JButton("Reset");

t1.setBounds(100,50,200,30);
t2.setBounds(100,110,200,30);
b1.setBounds(100,150,90,30);
b2.setBounds(190,150,90,30);

add(t1);
add(t2);
add(b1);
add(b2);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
if(t1.getText().toString().equals("admin") && t2.getText().toString().equals("admin")){
l2.setText("Welcome");
}
else {l2.setText("Invalid Credentials");}
}
});

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
t1.setText("");
t2.setText("");
}
});


}
}
class TestLogin{
public static void main(String[] args){
Login lg  = new Login();
lg.setBounds(400,400,400,400);
lg.setVisible(true);
}
}
