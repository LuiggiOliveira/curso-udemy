package swing;

import javax.swing.*;
import java.awt.*;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");

        // faz com que a operação padrão dessa função seja matar a aplicação
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600,200);
        janela.setLayout(new FlowLayout()); //layout simples para ver o botão sem ocupar a tela toda
        janela.setLocationRelativeTo(null); //centralizar na tela do computador (ou em relação a outra coisa)

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        // Jeito antigo o qual cria uma classe anômala (sem nome) já que não se pode instanciar uma interface
//      botao.addActionListener(new ActionListener() {
//          @Override
//          public void actionPerformed(ActionEvent e) {
//              System.out.println("Evento ocorreu!");
//          }
//      });

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!");
        });

        janela.setVisible(true);
    }
}
