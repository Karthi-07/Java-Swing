import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Stud extends JFrame implements ActionListener
{
    Container c;
    JLabel t,n,r,y,reg;
    JButton ad,clr;
    JRadioButton sec,third,four;
    JTextField t1,t2;
    JTextArea ta;
    ButtonGroup b;
    public Stud()
    {
       t = new JLabel("Data Entry");
       reg = new JLabel("Regtration Info :- ");
       n = new JLabel("Name :- ");
       r = new JLabel("Reg No :- ");
       y = new JLabel("Year :-  " );
       ad = new JButton("ADD");
       ad.addActionListener(this);
       clr = new JButton("CLEAR");
       clr.addActionListener(this);
       sec = new JRadioButton("2");
       third = new JRadioButton("3");
       four = new JRadioButton("4");
       b  = new ButtonGroup();
       b.add(sec);
       b.add(third);
       b.add(four);
       t1 = new JTextField(20);
       t2 = new JTextField(20);
       ta = new JTextArea(10,20);
       ta.setEditable(false);
       JScrollPane sc = new JScrollPane(ta);     
       JPanel p = new JPanel();
       p.setLayout(null);       
       p.add(t);
       p.add(n);       
       p.add(t1);
       p.add(r);
       p.add(t2);
       p.add(y);
       p.add(sec);
       p.add(third);
       p.add(four);
       p.add(ad);
       p.add(clr);
       p.add(reg);
       p.add(sc);
      t.setBounds(10,10,100,20);
      reg.setBounds(250,10,100,20);
      n.setBounds(10,50,100,20);
      sc.setBounds(250,50,180,180);
      t1.setBounds(70,50,100,20);
      r.setBounds(10,100,100,20);
      t2.setBounds(70,100,100,20);
      y.setBounds(10,150,100,20);
      sec.setBounds(50,150,40,20); 
      third.setBounds(90,150,40,20);    
      four.setBounds(130,150,40,20);      
      ad.setBounds(10,200,70,20);         
      clr.setBounds(90,200,90,20);
      add(p);
     } 
     public void actionPerformed(ActionEvent ae)
    {
        String temp = ae.getActionCommand();
        if(temp.equals("CLEAR"))
        {
            t1.setText("");
            t2.setText("");
            b.clearSelection();
            ad.setEnabled(true);
         }
        else
         { 
               String tem = "";
               if(sec.isSelected())  tem+=sec.getText();
               else if(third.isSelected()) tem+=third.getText();
               else tem+=four.getText();           
               tem+=" year";
               String k = "   "+t1.getText()+"\n"+"   "+t2.getText()+"\n"+"   "+tem+"\n"+"-------------------------------------------"+"\n";
               ta.append(k); 
               k="";
               ad.setEnabled(false);
          }
     } 
     public static void main(String argv[])
    {
       Stud s1 = new Stud();
       s1.setSize(500,500);
       s1.setTitle("Student Form ");
       s1.setVisible(true);
    }
}