import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppArquivoTxt extends JFrame implements ActionListener {
    JButton B1, B2, B3, B4;
    JLabel L1, L2;
    JTextField TF1;
    JTextArea TA1;
    FileDialog FD1, FD2;

    public static void main(String[] args) {
        new AppArquivoTxt();
    }

    AppArquivoTxt() {
        setTitle("Gravar/Ler Arquivo de Texto");
        setSize(500, 100);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        L1 = new JLabel("Texto a ser Editado:");
        TF1 = new JTextField();
        B1 = new JButton("Gravar");
        B1.addActionListener(this);
        B2 = new JButton("Abrir");
        B2.addActionListener(this);
        B3 = new JButton("Limpar");
        B3.addActionListener(this);
        B4 = new JButton("Sair");
        B4.addActionListener(this);
        getContentPane().add(L1);
        getContentPane().add(TA1);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(B4);
        getContentPane().add(L2);
        getContentPane().add(TF1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            File arquivo = new File("C:/Users/Win/Documents/arquivo.txt");

            try {
                arquivo.createNewFile();
                System.out.print("Arquivo criado com sucesso!");

            } catch (IOException ex) {
                ex.printStackTrace();

            }
        }
    }
}
