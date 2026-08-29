package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        Function<Double, String> conceito = n -> n >= 7 ? "Aprovado." : "Reprovado.";

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
//          double notaFinal = (n1 + n2) / 2;
            double notaFinal = media.apply(n1, n2);
//          return notaFinal >= 7 ? "Aprovado." : "Reprovado.";
            return conceito.apply(notaFinal);
        };

        System.out.println(resultado.apply(7.6, 5.2));
        System.out.println(resultado.apply(7.6, 9.0));

        System.out.println(media.andThen(conceito).apply(7.6, 5.2));
        System.out.println(media.andThen(conceito).apply(7.6, 9.0));
    }
}
