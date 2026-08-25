package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        // LEMBRNADO QUE: int -> Double (ERRADO) | double -> Double (CERTO)

        // USANDO UMA OUTRA INTERFACE FUNCIONAL, MAS DESSA VEZ É DO PRÓPRIO JAVA
        BinaryOperator<Double> calculo = (x, y) -> x + y;

        // MUDA-SE LOGO EM SEGUIDA OS MÉTODOS IMPLEMENTADOS DA MINHA INTERFACE PELA QUE EU ESTOU USANDO AGORA DO JAVA
        System.out.println(calculo.apply(2.0, 3.0));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0, 3.0));
        // ---------------------------------------------------
        BinaryOperator<Integer> calculo2 = (x, y) -> x + y;

        System.out.println(calculo2.apply(2, 3));

        calculo2 = (x, y) -> x * y;
        System.out.println(calculo2.apply(2, 3));
    }
}
