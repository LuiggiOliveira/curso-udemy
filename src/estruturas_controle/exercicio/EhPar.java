package estruturas_controle.exercicio;
import java.util.Scanner;

// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
public class EhPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para verificar se é par e está entre 0 e 10");
        int valor = sc.nextInt();
        int resto = valor % 2;

        if (resto == 0) {
            System.out.println("É par! E ");
            if (valor >= 0 && valor <= 10) System.out.println("está entre 0 e 10!");
            else System.out.println("não está entre 0 e 10...");
        }

        else {
            System.out.print("Não é par, então é ímpar! E ");
            if (valor >= 0 && valor <= 10) System.out.println("está entre 0 e 10!");
            else System.out.println("não está entre 0 e 10...");
        }

        sc.close();
    }
}
