package poo.heranca;

public class Jogador {
    private int vida = 100;
    protected int x, y;
    protected String nome;
    private int level = 1;

    public Jogador(String nome, int vida, int coord_x, int coord_y){
        this.nome = nome;
        this.vida = vida;
        this.x = coord_x; // poderia colocar uma condição para verificar se o outro jogador não começou no mesmo lugar que o outro
        this.y = coord_y;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1){
            oponente.vida -= 20; // aqui não preciso de setVida() porque já está na própria classe em que foi declarado o atributo private
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        } else {
            System.out.println(this.nome + " errou o ataque! (Fora do alcance)");
            return false;
        }
    }

    public boolean andar(Direcao direcao){
        switch (direcao){
            case CIMA: y++; break;
            case DIREITA: x++; break;
            case BAIXO: y--; break;
            case ESQUERDA: x--; break;
        }
        return true;
    }

    public void getCoordenadas(){ //todo talvez pensar em criar uma ilustração no plano cartesiano da posição do jogador
        System.out.printf("Coordenadas de %s -> X: %d | Y: %d%n", this.nome, this.x, this.y);
    }


    public void descansar(){
        this.vida += 10;
        System.out.println(this.nome + " está descansando... (Recuperou +10 de HP)");
    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida -= vida;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
