package poo.heranca;

public class Jogador {
    int vida = 100;
    int x = 0, y = 0;
    String nome;

    //TODO CRIAR SISTEMA DE COLISAO (UM JOGADOR NÃO PODE IR PARA A MESMA EXATA COORDENADA)

    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        } else {
            System.out.println(this.nome + " errou o ataque! (Fora do alcance)");
            return false;
        }
    }

    boolean andar(Direcao direcao){
        switch (direcao){
            case CIMA: y++; break;
            case DIREITA: x++; break;
            case BAIXO: y--; break;
            case ESQUERDA: x--; break;
        }
        return true;
    }

    void getCoordenadas(){ //todo talvez pensar em criar uma ilustração no plano cartesiano da posição do jogador
        System.out.printf("Coordenadas de %s -> X: %d | Y: %d%n", this.nome, this.x, this.y);
    }

    int getVida(){
        return this.vida;
    }

    void descansar(){
        this.vida += 10;
        System.out.println(this.nome + " está descansando... (Recuperou +10 de HP)");
    }
}
