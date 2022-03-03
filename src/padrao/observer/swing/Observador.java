package padrao.observer.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Obsevador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 janela.setSize(600, 200);
 janela.setLayout(new FlowLayout());
 janela.setLocationRelativeTo(null);// centralizar na tela

 JButton botao = new JButton("Clicar");
janela.add(botao);

botao.addActionListener(e -> System.out.println("Evento o correu"));

   janela.setVisible(true);
    }
}
