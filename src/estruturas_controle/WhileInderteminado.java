package estruturas_controle;

import java.util.Scanner;

public class WhileInderteminado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String qualquerCoisa;

        while (true) {
            System.out.println("[WHILE] Digite qualquer coisa aqui. Caso queira sair, digite 'exit'.");
            qualquerCoisa = sc.nextLine();

            if (qualquerCoisa.equalsIgnoreCase("exit")){
                System.out.println("-> Saindo do loop...");
                break;
            }

            System.out.println("[id 3143] Anônimo disse: " + qualquerCoisa);
        }

        //O EQUIVALENTE EM FOR SERIA:
        System.out.println("[FOR] Digite qualquer coisa aqui. Caso queira sair, digite 'exit'.");
        for (int i = 1; i != 0; i++){ //obs: incrementa, depois testa
            qualquerCoisa = sc.nextLine();

            if (qualquerCoisa.equalsIgnoreCase("exit")){
                System.out.println("-> Saindo do loop...");
                i = -1; //ou simplesmente "break"
            }

            System.out.println("[id 3143] Anônimo disse: " + qualquerCoisa);
        }

        sc.close();

        /*
        obs: o while normalmente é mais utilizado para quando eu não sei quantas iterações vou ter, caso eu saiba, uso for que é mais
        legível (e prático até, na minha opinião). Além disso, é interessante em casos que realmente necessite ter um loop
        que fica sempre rodando um bloco de código, que só para com determinada condição. Por exemplo, em um jogo onde a "gravidade"
        é simulada e que sempre está em execução, parando somente quando o sprite do personagem está encostando no chão.
        */
    }
}
