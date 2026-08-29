package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int expressao = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(3); // "pegue 3, some mais 2, multiplique por 2 e então eleve ao quadrado"
        System.out.println(expressao);

        // é o mesmo que o andThen, contudo, inverte o sentido das operações
        int expressao2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(3); // "pegue 3, eleve ao quadrado, antes multiplique por 2, mas antes some por 2"
        System.out.println(expressao2);
    }
}
