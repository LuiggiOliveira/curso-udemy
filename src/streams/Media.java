package streams;

public class Media {

    private double total;
    private int qtd;

    public Media adicionar(double valor) {
        total += valor;
        qtd++;
        return this; //assim eu posso encadear em uma única chamada todas as notas em uma pipeline
    }

    public double getValor() {
        return total / qtd;
    }

    public static Media combinar(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.qtd = m1.qtd + m2.qtd;
        return resultante;
    }
}
