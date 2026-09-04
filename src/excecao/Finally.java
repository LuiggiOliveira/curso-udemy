package excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try { // é possível fazer: try (Scanner entrada = new Scanner(System.in)
            System.out.print("Digite um valor de entrada: ");
            System.out.println(26 / entrada.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // Independentemente do que acontecer, vai executar esse bloco, mesmo que entre no catch ou não
            System.out.println("Finally #01...");
//            entrada.close();
        }

        try {
            System.out.print("Digite um valor de entrada: ");
            System.out.println(26 / entrada.nextInt());
        } finally {
            System.out.println("Finally #02...");
            entrada.close();
        }

        System.out.println("Fim.");
    }
}
