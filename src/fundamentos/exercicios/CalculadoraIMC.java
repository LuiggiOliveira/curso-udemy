package fundamentos.exercicios;

/* Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.  */

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[Calculando o IMC]");
        System.out.println("Digite o 'peso' (massa) em kg:");
        double massa = sc.nextDouble();
        System.out.println("Digite a altura em cm:");
        double altura = sc.nextDouble();
        double paraMetros = altura/100;
        double imc = massa/(paraMetros*paraMetros);

        System.out.printf(
                """
                MASSA:   %.2f kg
                ALTURA:  %.2f m
                IMC:     %.2f
                """, massa, paraMetros, imc);
        sc.close();
    }
}
