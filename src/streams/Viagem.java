package streams;

public class Viagem {

    final String nome;
    final int tempoDeEstadia;
    final double custoPassagem; //no caso considere o custo da soma da passagem de ida e volta

    public Viagem(String nome, int tempoDeEstadia, double custoPassagem) {
        this.nome = nome;
        this.tempoDeEstadia = tempoDeEstadia;
        this.custoPassagem = custoPassagem;
    }
}
