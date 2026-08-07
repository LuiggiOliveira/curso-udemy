package poo.heranca;

public class Jogo {
    public static void main(String[] args) {
        // nota: já estou imaginando um joguinho de turnos, com ataque, magias, estratégias, bloqueios...
        // eu acho que me empolguei aqui um pouco... No curso não tinha "descansar()","ataqueEspecial()", "bloquearAtaque()", colisão...
        Jogador monstro = new Monstro();
        monstro.x = 5;
        monstro.y = 1;
        monstro.nome = "Orc";

        Heroi heroi = new Heroi(); // eu tiver que instanciar uma classe Heroi e não Jogador para que pudesse de fato usar o ataqueEspecial(), já que é exclusivo de Heroi
        heroi.x = -4;
        heroi.y = -3;
        heroi.nome = "Gandalf";

        System.out.println("Orc: HP: " + monstro.getVida());
        System.out.println("Gandalf: HP: " + heroi.getVida());
        System.out.println("Coordenadas iniciais");
        monstro.getCoordenadas();
        heroi.getCoordenadas();

        System.out.println("\nTURNO 1");
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

        System.out.println("\nTURNO 2");
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURNO 3");
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURNO 4");
        heroi.atacar(monstro);
        monstro.andar(Direcao.CIMA);
        monstro.andar(Direcao.CIMA);
        monstro.andar(Direcao.CIMA);
        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURNO 5");
        heroi.atacar(monstro);
        monstro.andar(Direcao.ESQUERDA);
        monstro.descansar();

        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("\nTURNO 6 - O fim da batalha!");
        heroi.andar(Direcao.ESQUERDA);
        heroi.ataqueEspecial(monstro);

        System.out.println("Orc: HP: " + monstro.getVida());
        monstro.getCoordenadas();
        System.out.println("Gandalf: HP: " + heroi.getVida());
        heroi.getCoordenadas();

        System.out.println("*** FATALITY!! GANDALF WINS! ***");

    }
}
