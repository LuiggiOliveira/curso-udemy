package fundamentos.exercicios;

/* Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */

import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        //ok, vou usar o Scanner... Tá sendo um pouco mais rápido do que JOption para executar
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble(); //botar ',' e não '.' no terminal (diferentemente do JOption)
        double aoQuadrado = Math.pow(valor, 2);
        double aoCubo = Math.pow(valor, 3);
        System.out.printf("%.3f² = %.3f\n%.3f³ = %.3f", valor, aoQuadrado, valor, aoCubo);

        sc.close();
    }
}
