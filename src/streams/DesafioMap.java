package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* (como o foco não são os algoritmos, eu vou só usar os métodos nativos para fazer cada operação)
 * 1. Número para String binária... 6 => "110"
 * 2. Reverter a String... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 */

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //build (stream) -> intermediário (map, map, map) -> terminal (forEach) => pipeline
        nums.stream()
                .map(Integer::toBinaryString)
                .map(s -> new StringBuilder(s).reverse().toString())
                .map(n -> Integer.parseInt(n, 2))
                .forEach(System.out::println);
    }
}
