//javaloteria.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class javaloteria extends JFrame implements ActionListener
{
	JButton B1,B2,B3,B4;

	public static void main(String args[])
	 {
	 JFrame Janela = new javaloteria();
	 Janela.setVisible(true);
   }

 javaloteria()
 {
	setTitle("Loteria");
	setSize(150,200);
	setLocationRelativeTo(null);
	getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	B1 = new JButton("Mega Sena");
	B1.addActionListener(this);
	B2 = new JButton("Quina");
	B2.addActionListener(this);
	B3 = new JButton("Dupla Sena");
	B3.addActionListener(this);
	B4 = new JButton("Sair");
	B4.addActionListener(this);
	getContentPane().add(B1);
	getContentPane().add(B2);
	getContentPane().add(B3);
	getContentPane().add(B4);
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==B1)
	{
		JFrame jms = new javamegasena();
		jms.setVisible(true);
	}

	if(e.getSource()==B2)
	{
		JFrame jms = new javaquina();
		jms.setVisible(true);
	}

	if(e.getSource()==B3)
		{
			JFrame jms = new javaduplasena();
			jms.setVisible(true);
	}

	if(e.getSource()==B4)
	{
		System.exit(0);
	}
}}