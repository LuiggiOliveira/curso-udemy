package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> temTresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(temTresDigitos).negate().test(2026)); // true and ~(false) -> true
        System.out.println(isPar.or(temTresDigitos).test(193)); // false or true -> true
    }
}
