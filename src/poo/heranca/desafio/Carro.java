package poo.heranca.desafio;

public class Carro {

    int velocidadeAtual;
    int velocidadeMaxima;
    int aceleracao;

    Carro (){
        this.velocidadeMaxima = 130;
        this.aceleracao = 5;
    }

    boolean acelerar(){
        if ((velocidadeAtual + aceleracao) <= velocidadeMaxima){
            velocidadeAtual += aceleracao; // caso fosse, por exemplo, 129 km/h, daria para acelerar, mas no caso iria para 134km/h e não para 130 que é o max
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h.");
            return true;
        } else if ((velocidadeAtual + aceleracao) > velocidadeMaxima){
            velocidadeAtual = velocidadeMaxima; // aceleração constante
            System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h.");
            return true;
        }
        return false;
    }

    boolean frear(){
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
}
