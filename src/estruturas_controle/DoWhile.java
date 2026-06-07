package estruturas_controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String qualquerCoisa;

        do { //economizei um "if" em comparação ao código da classe "WhileIndeterminado"
            System.out.println("Digite qualquer coisa aqui. Caso queira sair, digite 'exit'.");
            qualquerCoisa = sc.nextLine();
            System.out.println("[id 3143] Anônimo disse: " + qualquerCoisa);
        } while (!qualquerCoisa.equalsIgnoreCase("exit"));

        System.out.println("Desligando os cabos do sistema (você digitou 'exit').");
        sc.close();

        /*é um while que é executado AO MENOS 1 VEZ, depois continua normalmente sem executar o bloco "DO",
        além disso, perceba que while é só condição e depois ';', ou seja, sem chaves para bloco de código
        já que o que estaria dentro dele, já está presente dentro de "do{}"*/
    }
}
