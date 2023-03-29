//Quina.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class javaquina extends JFrame implements ActionListener
{
    JLabel L1;
	JButton B1,B2;
	JTextField T1;
	int NR, n1, n2, n3, n4;

 public static void main(String args[])
 {
 JFrame Janela = new javaquina();
 Janela.setVisible(true);
   }

javaquina()
{
 setTitle("Quina");
 setSize(600,100);
 setLocationRelativeTo(null);
 getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
 L1 = new JLabel ("Pode ter Nº Repetidos:");
 T1 = new JTextField(18);
 B1 = new JButton("Limpar");
 B1.addActionListener(this);
 B2 = new JButton("Quina");
 B2.addActionListener(this);
 getContentPane().add(L1);
 getContentPane().add(T1);
 getContentPane().add(B2);
 getContentPane().add(B1);
  }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==B2)
{
NR = (int) (Math.random()*80)+1;
n1= (int) (Math.random()*80)+1;
n2= (int) (Math.random()*80)+1;
n3= (int) (Math.random()*80)+1;
n4= (int) (Math.random()*80)+1;
T1.setText(""+NR + ", " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
}
if(e.getSource()==B1)
{
        T1.setText(" ");
		 return;
		 }
}}
