package streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media();
        m1.adicionar(8.3);
        m1.adicionar(6.7);

        Media m2 = new Media().adicionar(9.3).adicionar(7.7);

        System.out.println("Média 1: " + m1.getValor());
        System.out.println("Média 2: " + m2.getValor());
        System.out.println("Combinando duas médias: " + Media.combinar(m1, m2).getValor());
    }
}
