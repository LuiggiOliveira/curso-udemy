package fundamentos;

import javax.swing.*;

public class StringParaNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

        System.out.println(valor1 + valor2);

        double d1 = Double.parseDouble(valor1);
        double d2 = Double.parseDouble(valor2);
        double soma = d1+d2;

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Média: %.2f", soma/2);
    }
}
