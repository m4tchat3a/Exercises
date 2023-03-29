import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW2_2 extends JFrame implements ActionListener
{
JLabel L1, L2, L3, L4;
JButton B1;

ExJW2_2()
{
 setTitle("Janela Labels e Botão");
 setSize(300,300);
 setLocation(50,50);
 setResizable(false);
 getContentPane().setBackground(Color.white);
 L1 = new JLabel ("2º  Internet E ", JLabel.LEFT);
 L1.setForeground(Color.red);
  L2 = new JLabel("FITO");
  L2.setFont(new Font(" ",Font.BOLD,20));
 L3 = new JLabel ("Nº 16 Luanda",JLabel.RIGHT);
 L3.setForeground(Color.blue);
 L4 = new JLabel("Labels e Mensagens",JLabel.CENTER);
 L4.setForeground(Color.black);
 B1 = new JButton("Sair");
 B1.addActionListener(this);
 getContentPane().setLayout(new GridLayout(5,1));
 getContentPane().add(L2);
 getContentPane().add(L4);
 getContentPane().add(L1);
 getContentPane().add(L3);
 getContentPane().add(B1);
 }
 public void actionPerformed(ActionEvent e)
 {
 if(e.getSource()==B1)
 System.exit(0);
 }
public static void main(String args[])
 {
	 JFrame Janela = new ExJW2_2();
	 Janela.setVisible(true);
}}
