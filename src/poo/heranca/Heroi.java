package poo.heranca;

public class Heroi extends Jogador {

    public Heroi(String nome, int vida, int coord_x, int coord_y){
        super(nome, vida, coord_x, coord_y);
        // é necessário chamar o construtor do pai para acessar atributos privados já que, por exemplo, vida e nome foram declarados em Jogador
        // mesmo que herdados, porém, os atributos protected as classes filhas conseguem acessar diretamente
    }

    @Override
    public boolean atacar(Jogador oponente){
        return super.atacar(oponente); // Reaproveita o código da superclasse;
    }

    public boolean ataqueEspecial(Jogador oponente){ // Bola de fogo pequena single target de 6 quadrados de range (e que dá muito dano)
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && (deltaY > 3 && deltaY <= 6)){
            oponente.setVida(50);
            return true;
        } else if ((deltaX >= 3 && deltaX <= 6) && deltaY == 0) {
            oponente.setVida(50);
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
