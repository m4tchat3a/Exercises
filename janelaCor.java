import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW1 extends JFrame
{
	ExJW1()
	{
	 setTitle("Janela Colorida Java");
	 setSize(400,200);
	 setLocation(150,150);
	 setResizable(false);
	 getContentPane().setBackground(Color.pink);
 }
 public static void main(String args[])
 {
	 JFrame Janela = new ExJW1();
	 Janela.setVisible(true);
}}



