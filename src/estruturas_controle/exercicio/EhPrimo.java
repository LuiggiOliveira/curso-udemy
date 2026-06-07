package estruturas_controle.exercicio;

// Criar um programa que receba um número e diga se ele é um número primo.

import java.util.Scanner;

public class EhPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo para saber se ele é primo");
        int primo = sc.nextInt(); //982451653 (demorou uns 2 segundos para finalizar o programa, após o input é claro)
        int divisores = 0;

        if (primo < 1 ) System.out.println("É um número negativo. Digite um inteiro positivo");

        for (int i = 1; i <= primo; i++){
            if (primo % i == 0) divisores++;
        }

        if (divisores == 2) System.out.println("É primo!");
        else System.out.println("Não é primo");

        sc.close();
    }
}
