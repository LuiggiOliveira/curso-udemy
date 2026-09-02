package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Luca");

        System.out.println("Usando o foreach..."); // IMPLICITAMENTE TEM UM ITERATOR, PORÉM APENAS LÊ OS DADOS
        for (String nome : aprovados){
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> stringIterator = aprovados.iterator(); // ELEMENTOS MUTÁVEIS, MAIOR GRANULARIDADE NO CONTROLE, MAIS LEVE...
        while (stringIterator.hasNext()){ // E EXPÕE O METODO remove()
            System.out.println(stringIterator.next());
        }

        System.out.println("\nUsando Stream..."); // possui um laço interno
        Stream<String> stringStream = aprovados.stream(); // ELEMENTOS IMUTÁVEIS
        stringStream.forEach(System.out::println); // TENTAR MODIFICAR A COLEÇÃO ORIGINAL DURANTE O PROCESSAMENTO LANÇA UM ERRO
    }
}
