package estruturas_controle.exercicio;
import java.util.Scanner;

/*
Jogo da adivinhação:
-> Tentar adivinhar um número entre 0 - 100.
-> Armazene um numero aleatório em uma variável. (NÃO USAR A BIBLIOTECA QUE GERA NÚMEROS ALEATÓRIOS)
-> O Jogador tem 10 tentativas para adivinhar o número gerado.
-> Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido
é maior ou menor do que o número armazenado.
 */

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = 67, tentativas = 0;
        boolean teste = false;

        System.out.println("INICIANDO 'JOGO DA ADIVINHAÇÃO'");
        System.out.println("Tente adivinhar um número de 0 a 100. Você tem 10 tentativas.");

        while (tentativas < 10){
            System.out.println("Palpite: ");
            int palpite = sc.nextInt();

            if (palpite == numAleatorio){
                System.out.printf("Parabéns! Você acertou na %dª tentativa!", tentativas+1);
                teste = true;
                break;
            }

            if (palpite < numAleatorio) System.out.println("O número secreto é MAIOR.\n");
            if (palpite > numAleatorio) System.out.println("O número secreto é MENOR.\n");

            tentativas++;
        }

        if (!teste) System.out.printf("Você infelizmente não conseguiu... O número secreto era %d :(", numAleatorio);
    }
}
