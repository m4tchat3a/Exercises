import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW3 extends JFrame implements ActionListener
{ 
    JLabel L1, L2, L3;
    JButton B1, B2, B3;
    JTextField T1, T2, T3;

    public static void main(String args[])
    {
        JFrame JCalculadora = new ExJW3();
        JCalculadora.setVisible(true);
    }
    ExJW3()
{
 setTitle("Calculadora");
 setSize(400,150);
 setLocation(50,50);
 L1 = new JLabel ("Numero 1: ");
 L1.setForeground(Color.black);
 L1.setFont(new Font("",Font.BOLD,14));

 L2 = new JLabel ("Numero 2: ");
 L2.setForeground(Color.black);
 L2.setFont(new Font("",Font.BOLD,14));

 L3 = new JLabel ("Resultado:");
 L3.setForeground(Color.black);
 L3.setFont(new Font("",Font.BOLD,14));

 B1 = new JButton("x");
 B1.addActionListener(this);
 B2 = new JButton("÷");
 B2.addActionListener(this);
 B3 = new JButton("Limpar");
 B3.addActionListener(this);
 T1 = new JTextField();
 T2 = new JTextField();
 T3 = new JTextField();
 T3.setEditable(false);

 getContentPane().setBackground(Color.white);
 getContentPane().setLayout(new GridLayout(3,3));

 getContentPane().add(L1); getContentPane().add(T1); getContentPane().add(B1);
 getContentPane().add(L2); getContentPane().add(T2); getContentPane().add(B2);
 getContentPane().add(L3); getContentPane().add(T3); getContentPane().add(B3);
}

public void actionPerformed(ActionEvent e)
{
    float N1=0 , N2=0, Result=0;
    if(e.getSource()==B3)
    {
    T1.setText(""); T2.setText(""); T3.setText("");
    return;
       }

    N1 = Float.parseFloat(T1.getText());
    N2 = Float.parseFloat(T2.getText());
     if(e.getSource()==B1)
     Result=N1*N2;
     if(e.getSource()==B2)
        if (N2==0)
        {    T3.setText("Erro! Dividido por 0");
      return;
               } else {
                            Result=N1/N2;}
     T3.setText(" "+Result);}
     }


