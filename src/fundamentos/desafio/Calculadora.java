package fundamentos.desafio;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        // Eu já fiz isso até com funções, porém neste desafio em específico vou utilizar só com o que foi ensinado até agora

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor:");
        String operacao = JOptionPane.showInputDialog("Digite a operação desejada (+ - * / %):");

        double d1 = Double.parseDouble(valor1);
        double d2 = Double.parseDouble(valor2);
        //já que ainda neste módulo não chegamos no if, else, switch... vou usar o operador ternário

        double resultado = operacao.equals("+") ? d1 + d2
                : operacao.equals("-") ? d1 - d2
                : operacao.equals("*") ? d1 * d2
                : operacao.equals("/") ? d1 / d2
                : operacao.equals("%") ? d1 % d2 : 0;

        System.out.printf(
                """
                _______________________________
                CALCULADORA 3000 TURBO PRO MAX
                _______________________________
                -> VALOR 1: %.2f
                -> VALOR 2: %.2f
                -> OPERAÇÃO: %s
                -> RESULTADO: %.2f
                _______________________________
                """, d1, d2, operacao, resultado);
    }
}
