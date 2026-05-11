package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        String msg = "Bom dia";

        System.out.print("Bom");
        System.out.print(" dia");

        System.out.println("Bom");
        System.out.println(" dia");

        System.out.printf("%s\n", "Bom dia");
        System.out.printf("%s", "Bom dia\n");
        System.out.printf("%s\n", msg);

        System.out.printf("%20s", "Bom dia\n");
        System.out.printf("%20s %s\n", "Bom", "dia");

        //arredondamento a partir de 5
        System.out.printf("%.3f\n", 1.2344); //1.234
        System.out.printf("%.3f\n", 1.2345); //1.235
        System.out.printf("%.3f\n", 1.2346); //1.236

        Scanner sc = new Scanner(System.in); //woow nunca usei isso aqui!!! (ironia)

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.printf("Seu nome é %s\n", nome);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.printf("Sua idade é %d\n", idade);

        sc.nextLine(); //limpa o buffer de entrada (JÁ TIVE ALGUMAS VEZES ESSE PROBLEMA COM O "nextInt()")

        System.out.println("Digite seu nome:");
        String sobrenome = sc.nextLine();
        System.out.printf("Seu nome é: %s %s e você tem %d anos\n", nome, sobrenome, idade);

        sc.close();

        //Isso acontece porque o nextInt() só pega int, aí quando aperto o TAB no console, coloca-se automaticamente '\n',
        //ou seja, uma quebra de linha, e aí o buffer de entrada entende como se estivéssemos concatenando o valor int digitado
        //com o '\n', ficando por exemplo "10\n".

    }
}
