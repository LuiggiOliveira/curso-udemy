package poo.heranca.desafio_encapsulamento;

import poo.heranca.Direcao;
import poo.heranca.Heroi;
import poo.heranca.Jogador;
import poo.heranca.Monstro;

// todo MUDEI PARA ESSA PASTA POR CONTA DO DESAFIO DE ENCAPSULAMENTO, PRECISANDO APLICAR OS MODIFICADORES DE ACESSO E FAZER
//  ESSE CÓDIGO VOLTAR A FUNCIONAR
public class Jogo {
    public static void main(String[] args) {
        // nota: já estou imaginando um joguinho de turnos, com ataque, magias, estratégias, bloqueios...
        // eu acho que me empolguei aqui um pouco... No curso não tinha "descansar()","ataqueEspecial()", "bloquearAtaque()"
        Jogador monstro = new Monstro("Orc", 100, 5, 1);
        Heroi heroi = new Heroi("Gandalf", 100, -4, -3); // eu tiver que instanciar uma classe Heroi e não Jogador para que pudesse de fato usar o ataqueEspecial(), já que é exclusivo de Heroi

        System.out.println("Orc: HP: " + monstro.getVida());
        System.out.println("Gandalf: HP: " + heroi.getVida());
        System.out.println("Coordenadas iniciais");
        monstro.getCoordenadas();
        heroi.getCoordenadas();

        System.out.println("\nTURN 1");
        monstro.andar(Direcao.ESQUERDA);
        monstro.andar(Direcao.BAIXO);
        monstro.andar(Direcao.BAIXO);
        monstro.andar(Direcao.ESQUERDA);
        monstro.andar(Direcao.ESQUERDA);
        monstro.andar(Direcao.ESQUERDA);
        monstro.getCoordenadas();

        heroi.andar(Direcao.DIREITA);
        heroi.andar(Direcao.DIREITA);
        heroi.andar(Direcao.DIREITA);
        heroi.andar(Direcao.DIREITA);
        heroi.andar(Direcao.DIREITA);
        heroi.andar(Direcao.CIMA);
        heroi.getCoordenadas();

        System.out.println("\nTURN 2");
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURN 3");
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURN 4");
        heroi.atacar(monstro);
        monstro.andar(Direcao.CIMA);
        monstro.andar(Direcao.CIMA);
        monstro.andar(Direcao.CIMA);
        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURN 5");
        heroi.atacar(monstro);
        monstro.andar(Direcao.ESQUERDA);
        monstro.descansar();

        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURN 6 - O fim da batalha!");
        heroi.andar(Direcao.ESQUERDA);
        heroi.ataqueEspecial(monstro);

        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("*** FATALITY!! GANDALF WINS! ***");
        System.out.println("Gandalf's leveled up to level 2!: ");
        heroi.setLevel(2);
        System.out.println("Gandalf's level: " + heroi.getLevel());
    }
}
