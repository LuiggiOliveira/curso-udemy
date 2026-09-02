package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {
        //obs: .forEach() é uma "terminal operation"

//      Consumer<Object> print = System.out::print;
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Pearl ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print); // uso de sub-array

        System.out.println();

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "C# ", "Ruby ", "Kotlin ");
        outrasLangs.stream().forEach(print); //apesar que pelo menos nesse caso, não seria necessário stream() para iterar...
        System.out.println();
        outrasLangs.parallelStream().forEach(print); // não mostra necessariamente na ordem

//      !!! Loops infinitos !!!
//      Stream.generate(() -> "a").forEach(print); // Sem ordenação (até porque ele é um Consumer, logo, não existe sequência lógica)
//      Stream.iterate(0, n -> n + 1).forEach(println); // Aqui já é o contrário, usa-se um Supplier, portanto, é ordenado
    }
}
