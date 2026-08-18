package poo.heranca;

public class Monstro extends Jogador {

    public Monstro(String nome, int vida, int coord_x, int coord_y){
        super(nome, vida, coord_x, coord_y);
    }

    @Override
    public boolean atacar(Jogador oponente){ // aqui eu deixei sem usar o super.atacar(oponente) para mostrar que é possível fazer assim também
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1){
            oponente.setVida(11);  // no caso alterei para não setar para 11, mas sim para decrementar 11 a vida do oponente
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.setVida(11);
            return true;
        } else {
            System.out.println(this.nome + " errou o ataque! (Fora do alcance)");
            return false;
        }
    }

    //TODO bloquear() O MONSTRO TEM UMA CHANCE DE 25% DE BLOQUEAR ATAQUE POR COMPLETO OU EM CASOS DE
    // ATAQUES ESPECIAIS MÁGICOS, REDUZIR PARCILALMENTE O DANO
    // pensando bem... vou implementar isso não, se não eu vou acabar criando um jogo aqui e não progredir no curso
}
