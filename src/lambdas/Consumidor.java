package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
        // Consumer<Produto> imprimir = System.out::println;
        // produtos.forEach(imprimir);

        Produto p1 = new Produto("Caneta", 10.00, 0.09);
        imprimir.accept(p1);
        Produto p2 = new Produto("Notebook", 2000.00, 0.20);
        Produto p3 = new Produto("Caderno", 20.00, 0.10);
        Produto p4 = new Produto("Lápis", 4.00, 0.15);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        // o forEach já espera um Consumer como parâmetro
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
