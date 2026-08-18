package poo.heranca.desafio;

public class Carro {

    protected int velocidadeAtual;
    public final int VELOCIDADE_MAXIMA;
    private int aceleracao;

    Carro (){
        this.VELOCIDADE_MAXIMA = 130;
        this.aceleracao = 5;
    }

    public Carro (int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.aceleracao = 5;
    }

    public boolean acelerar(){
        if ((velocidadeAtual + getAceleracao()) <= VELOCIDADE_MAXIMA){
            velocidadeAtual += getAceleracao(); // caso fosse, por exemplo, 129 km/h, daria para acelerar, mas no caso iria para 134km/h e não para 130 que é o max
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h.");
            return true;
        } else if ((velocidadeAtual + getAceleracao()) > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA; // aceleração constante
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h.");
            return true;
        }
        return false;
    }

    public boolean frear(){
        if (velocidadeAtual >= aceleracao){
            velocidadeAtual -= aceleracao;
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h.");
            return true;
        } else if (velocidadeAtual > 0){ //caso a velocidade seja menor que a aceleração e maior que 0, freia totalmente o carro
            velocidadeAtual = 0;
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h.");
            return true;
        }
        System.out.println("Não foi possível desacelerar, pois o carro já está parado.");
        return false;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
}
