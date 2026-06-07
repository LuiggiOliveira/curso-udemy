package estruturas_controle.exercicio;

//Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
// caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.

import java.util.Scanner;

public class ImprimeSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite para cada valor A e valor B um número positivo para que retorne a soma deles.");
        System.out.println("Caso digite um número negativo, o programa será encerrado.");
        while (true){
            System.out.println("VALOR A:");
            double a = sc.nextDouble();
            if (a < 0) {
                System.out.println("Encerrando programa. (Você digitou um valor negativo para A)");
                break;
            }

            System.out.println("VALOR B:");
            double b = sc.nextDouble();
            if (b < 0) {
                System.out.println("Encerrando programa. (Você digitou um valor negativo para B)");
                break;
            }

            System.out.printf("%.2f + %.2f = %.2f\n", a, b, a+b);
         }
    }
}
