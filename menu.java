//ExJWMenu.java 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJWMenu extends JFrame implements ActionListener {
    JMenuBar MB;
    JTextField T1;
    JMenu mCadastro, mRelatorio;
    JMenuItem micliente, mifornecedor, misair, mirlcliente, mirlfornecedor;

    public static void main(String args[]) {
        JFrame JanelaM = new ExJWMenu();
        JanelaM.setVisible(true);
        WindowListener x = new WindowAdapter() {
            public void windowclosing(WindowEvent e) {
                System.exit(0);
            }
        };
    }

    ExJWMenu() {
        setTitle("Menu");
        setSize(300, 150);
        setLocation(50, 50);
        getContentPane().setBackground(new Color(0, 128, 128));
        T1 = new JTextField();
        MB = new JMenuBar();
        mCadastro = new JMenu("Cadastro");
        mRelatorio = new JMenu("Relatorios");
        micliente = new JMenuItem("Cliente");
        micliente.addActionListener(this);
        mifornecedor = new JMenuItem("Fornecedor");
        mifornecedor.addActionListener(this);
        misair = new JMenuItem("Sair");
        misair.addActionListener(this);
        mCadastro.add(micliente);
        mCadastro.add(mifornecedor);
        mCadastro.add(misair);
        mirlcliente = new JMenuItem("Relação de Clientes");
        mirlcliente.addActionListener(this);
        mirlfornecedor = new JMenuItem("Relação de Fornecedores");
        mirlfornecedor.addActionListener(this);
        mRelatorio.add(mirlcliente);
        mRelatorio.add(mirlfornecedor);
        MB.add(mCadastro);
        MB.add(mRelatorio);
        setJMenuBar(MB);
        getContentPane().add(T1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == micliente)
            T1.setText("Você escolheu o item cliente");
        if (e.getSource() == mifornecedor)
            T1.setText("Você escolheu o item fornecedor");
        if (e.getSource() == mirlcliente)
            T1.setText("Você escolheu o item\nrelação de clientes");
        if (e.getSource() == mirlfornecedor)
            T1.setText("Você escolheu o item\nrelação de fornecedores");
        if (e.getSource() == misair)
            System.exit(0);
    }
}
