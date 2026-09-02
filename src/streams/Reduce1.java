package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> somatoria = (ac, n) -> ac + n; // pode-se trocar por "Integer::sum"

//      O reduce é uma função terminadora, pois transforma um stream de dados num único dado de mesmo tipo ou não
        Optional<Integer> total2 = nums.stream().reduce(somatoria); // o Java não permite apenas usar o tipo primitivo nesse caso

        // porém, eu posso usar .get() e aí sim utilizar o primitivo, no caso "int total"
        int total = nums.stream().reduce(somatoria).get(); // aqui eu poderia usar tranquilamente o .parallelStream()

        // ou ainda, eu posso fazer tendo o acumulador com valor definido, ou como o Java chama: "identidade"
        Integer total3 = nums.stream().reduce(0, somatoria);

        // agora usando o .parallelStream(), o valor identidade acaba sendo passado para cada elemento
        Integer total4 = nums.parallelStream().reduce(100, somatoria); // somatória dos elementos: 45 + 9 elementos * 100 = 945
        // lembrando: stream() -> sequencial | parallelStream() -> em paralelo (como o próprio nome já diz)

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);

        // o resultado é um Optional<Integer>, no caso 20
        nums.stream()
                .filter(n -> n % 2 == 0)
                .reduce(somatoria)
                .ifPresent(System.out::println); // Optional<T>.ifPresent() ou Optional<T>.empty()

        // obs: o Optional é para o .reduce() tratar possíveis valores nulos na stream ou até mesmo com casos de stream vazia,
        // evitando lançamento de exceções ou valores indefinidos

//        Integer x = null;
//        int z = x; -> lança NullPointerException, que é uma das coisas que poderia acontecer ao usar o reduce() sem o Optional
     }
}
