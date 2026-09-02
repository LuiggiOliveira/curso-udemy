package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda\n");
        marcas.stream().map(String::toUpperCase).forEach(print); //n -> n.toUpperCase() virou String::toUpperCase

//        UnaryOperator<String> maiuscula = String::toUpperCase;
//        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//        UnaryOperator<String> grito = n -> n + "!!! ";

        System.out.println(Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios::grito).apply("BMW"));

        System.out.println("\nUsando Composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print); // N map() intermediário + 1 forEach() terminal
    }
}
