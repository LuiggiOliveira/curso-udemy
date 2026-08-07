package poo.heranca;

public class Heroi extends Jogador {

    @Override
    boolean atacar(Jogador oponente){
        return super.atacar(oponente); // Reaproveita o código da superclasse;
    }

    boolean ataqueEspecial(Jogador oponente){ // Bola de fogo pequena single target de 6 quadrados de range (e que dá muito dano)
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && (deltaY > 3 && deltaY <= 6)){
            oponente.vida -= 50;
            return true;
        } else if ((deltaX >= 3 && deltaX <= 6) && deltaY == 0) {
            oponente.vida -= 50;
            return true;
        } else {
            System.out.println(this.nome + " errou o ataque especial! (Fora do alcance entre 3 a 6 quadrados)");
            return false;
        }

        //TODO EU DEVO COLOCAR UM COOLDOWN AQUI PQ SE NÃO É SÓ FICAR ATACANDO COM ELE AO INVÉS DO ATAQUE NORMAL
        //TODO mas eu não vou fazer, é claro, porque era só pra ser um exemplo de uso de herança e não um jogo realmente
        //TODO e agora eu estou pensando em como deveria ser feito para os ataques acertarem nas diagonais...
    }
}
