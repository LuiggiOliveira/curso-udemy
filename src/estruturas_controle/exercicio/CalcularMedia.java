package estruturas_controle.exercicio;

/*
Criar um programa que receba duas notas parciais, calcular a média final.
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
caso contrário imprime no console "Reprovado".
 */

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        String mensagemParcial, mensagemFinal;

        System.out.println("Digite o valor da primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Calculando média...");
        media = (nota1+nota2)/2;
        mensagemParcial = media > 4 && media < 7 ? "Recuperação." : "Reprovado.";
        mensagemFinal = media >= 7 ? "Aprovado." : mensagemParcial;
        System.out.println(mensagemFinal);

        sc.close();
    }
}
