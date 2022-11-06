import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
   JLabel user,pass,title;
   JTextField u1;
   JPasswordField p1;
   JButton log,sign; 
   Container c1;
   String c2="";
   String username = "user";
   String password = "pass";
   public Login()
  {
      title = new JLabel("Login Form");
      user = new JLabel("username :- ");
      u1 = new JTextField(20);
      pass = new JLabel("password :- ");
      p1 = new JPasswordField(20);
      log = new JButton("Login");
      log.addActionListener(this);
      sign = new JButton("Sign Up");
      sign.addActionListener(this);
      JPanel pan = new JPanel();
      pan.setLayout(null);
      pan.add(title);title.setBounds(50,10,100,20);
      pan.add(user);user.setBounds(10,40,100,20);
      pan.add(u1);u1.setBounds(80,40,100,20);
      pan.add(pass);pass.setBounds(10,80,100,20);
      pan.add(p1);p1.setBounds(80,80,100,20);
      pan.add(log); log.setBounds(20,120,80,20);
      pan.add(sign);sign.setBounds(120,120,80,20); 
      add(pan);
   }
    public void actionPerformed(ActionEvent ae)
   {
       String click = ae.getActionCommand();
       int flag=0;
       if(click.equals("Login"))
       {
            if(u1.getText().equals(username) && Arrays.equals(password.toCharArray(),p1.getPassword()))
           {
                   JOptionPane.showMessageDialog(this,"The User Details are CORRECT","SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
           }
           else if(!u1.getText().equals("") && !Arrays.equals(c2.toCharArray(),p1.getPassword()))
           {
                 log.setEnabled(false);
                 JOptionPane.showMessageDialog(this,"Password/Username or Incorrect","INVALID CREDENTIALS",JOptionPane.ERROR_MESSAGE);
           } 
           else if(u1.getText().equals("") ||  Arrays.equals(c2.toCharArray(),p1.getPassword()))
           {
                 JOptionPane.showMessageDialog(this,"Please fill the details","ERROR",JOptionPane.WARNING_MESSAGE);      
           }
        u1.setText("");
        p1.setText("");
        }       
       else
       {   
            class Signup extends JFrame implements ActionListener
           {
              JLabel user1,pass1,pass2;
              JTextField u1;
              JPasswordField pt1,pt2;
              JButton con; 
              String c="";
              public Signup()
             {
               user1 = new JLabel("New User Name : -");
               u1 = new JTextField(20);
               pass1 = new JLabel(" New Password :- ");
               pass2 = new JLabel("Reenter password :- ");
               pt1 = new JPasswordField(20);
               pt2 = new JPasswordField(20);
               con = new JButton("Confirm");
               con.addActionListener(this);
               //con.setEnabled(false);
               JPanel pan1 = new JPanel();
               pan1.setLayout(null);
               pan1.add(user1);user1.setBounds(20,10,120,20);
               pan1.add(u1);u1.setBounds(140,10,120,20);
               pan1.add(pass1);pass1.setBounds(20,50,120,20);
               pan1.add(pt1);pt1.setBounds(140,50,120,20);
               pan1.add(pass2);pass2.setBounds(20,90,120,20);
               pan1.add(pt2); pt2.setBounds(140,90,120,20);
               pan1.add(con);con.setBounds(100,140,100,20); 
              add(pan1);
              }
             public void actionPerformed(ActionEvent ae)
             {
                    if(u1.getText().equals("") || Arrays.equals(c.toCharArray(),pt1.getPassword()) || Arrays.equals(c.toCharArray(),pt2.getPassword()) )
                   {
                           JOptionPane.showMessageDialog(this,"Please fill the details","INVALID",JOptionPane.ERROR_MESSAGE);    
                    }        
                   else if(!u1.getText().equals("") && !Arrays.equals(c.toCharArray(),pt1.getPassword()) && !Arrays.equals(c.toCharArray(),pt2.getPassword()))
                   {
                        if(Arrays.equals(pt1.getPassword(),pt2.getPassword()))
                        {
                               JOptionPane.showMessageDialog(this,"Your Account Created Successfully","Account Created",JOptionPane.INFORMATION_MESSAGE);
                               log.setEnabled(true);
                        }  
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Password doesn't Same","INVALID",JOptionPane.ERROR_MESSAGE);
                        }            
                    }
                 u1.setText("");
                 pt1.setText("");
                 pt2.setText("");
              } 
         }
               Signup s = new Signup();
               s.setLocation(250,30);
               s.setSize(400,400);
               s.setTitle("Sign-Up");
               s.setVisible(true); 
       } 
 }
   public static void main(String a[])
   {
      Login l = new Login();
      l.setSize(700,700);
      l.setVisible(true);
      l.setTitle("Login form");
      l.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}