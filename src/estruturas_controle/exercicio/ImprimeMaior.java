package estruturas_controle.exercicio;

// Crie um programa que recebe 10 valores e ao final imprima o maior número.

import java.util.Scanner;

public class ImprimeMaior {
    public static void main(String[] args) {
        // POR FAVOR CHEGA EM ARRAYS LOGO!!
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor1: ");
        int valor1 = sc.nextInt();
        System.out.println("Valor2: ");
        int valor2 = sc.nextInt();
        System.out.println("Valor3: ");
        int valor3 = sc.nextInt();
        System.out.println("Valor4: ");
        int valor4 = sc.nextInt();
        System.out.println("Valor5: ");
        int valor5 = sc.nextInt();
        System.out.println("Valor6: ");
        int valor6 = sc.nextInt();
        System.out.println("Valor7: ");
        int valor7 = sc.nextInt();
        System.out.println("Valor8: ");
        int valor8 = sc.nextInt();
        System.out.println("Valor9: ");
        int valor9 = sc.nextInt();
        System.out.println("Valor10: ");
        int valor10 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4 && valor1 > valor5 && valor1 > valor6 &&
            valor1> valor7 && valor1 > valor8 && valor1 > valor9 && valor1 > valor10){
            System.out.println("O 1° valor é o maior " + valor1);
        }
        else if (valor2 > valor3 && valor2 > valor4 && valor2 > valor5 && valor2 > valor6 && valor2> valor7 &&
                valor2 > valor8 && valor2 > valor9 && valor2 > valor10){
            System.out.println("O 4° valor é o maior " + valor2);
        }
        else if (valor3 > valor4 && valor3 > valor5 && valor3 > valor6 && valor3> valor7 && valor3 > valor8 &&
                valor3 > valor9 && valor3 > valor10){
            System.out.println("O 3° valor é o maior " + valor3);
        }
        else if (valor4 > valor5 && valor4 > valor6 && valor4> valor7 && valor4 > valor8 && valor4 > valor9 && valor4 > valor10){
            System.out.println("O 4°valor é o maior. " + valor4);
        }
        else if (valor5 > valor6 && valor5> valor7 && valor5 > valor8 && valor5 > valor9 && valor5 > valor10){
            System.out.println("O 5° valor é o maior. " + valor5);
        }
        else if (valor6> valor7 && valor6 > valor8 && valor6 > valor9 && valor6 > valor10){
            System.out.println("O 6° valor é o maior. " + valor6);
        }
        else if (valor7 > valor8 && valor7 > valor9 && valor7 > valor10){
            System.out.println("O 7° valor é o maior. " + valor7);
        }
        else if (valor8 > valor9 && valor8 > valor10){
            System.out.println("O 8° valor é o maior. " + valor8);
        }
        else if (valor9 > valor10){
            System.out.println("O 9° valor é o maior. " + valor9);
        }
        else {
            System.out.println("O 10° valor é o maior. " + valor10);
        }
        System.out.println("eu sinto que criei um monstro...");

        sc.close();
    }
}
