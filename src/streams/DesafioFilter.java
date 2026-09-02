package streams;

/* Desafio que eu mesmo propus (já que é sugerido que eu mesmo pense num desafio) é que eu
* desejo viajar para algum lugar, logo, pego uma lista de lugares que eu gostaria de viajar.
* Porém, eu quero filtrar apenas as viagens que ficarei pouco tempo e que, principalmente, que estejam mais
* dentro do meu orçamento. O tempo que eu gostaria de ficar em cada viagem seria entre 1 a 7 dias. Além disso,
* o custo de cada viagem deve estar abaixo de 700 reais. Ao final, quero uma lista com os "candidatos" que melhor
* se encaixam nesses requisitos.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        // no momento estou com preguiça de procurar/pensar muito em quais cidades, preços e etc, então vou ser o mais genérico possível aqui
        Viagem v1 = new Viagem("Cidade A", 14, 1000.00);
        Viagem v2 = new Viagem("Cidade B", 5, 354.33);
        Viagem v3 = new Viagem("Cidade C", 7, 605.20);
        Viagem v4 = new Viagem("Cidade D", 8, 764.75);
        Viagem v5 = new Viagem("Cidade E", 10, 546.43);
        Viagem v6 = new Viagem("Cidade F", 12, 700.00);
        Viagem v7 = new Viagem("Cidade G", 5, 435.50);
        Viagem v8 = new Viagem("Cidade H", 3,543.00);
        Viagem v9 = new Viagem("Cidade I", 7,865.54);
        Viagem v10 = new Viagem("Cidade J", 2,250.80);

        Consumer<String> println = System.out::println;

        List<Viagem> listaViagens = Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);

        Predicate<Viagem> tempoDeEstadia = v -> v.tempoDeEstadia <= 7;
        Predicate<Viagem> custoPassagem = v -> v.custoPassagem <= 700.00;
        Function<Viagem, String> listaNova = v ->
                String.format("-> Nome: %s | Tempo de Estadia: %d | Custo de Ida e Volta: %.2f",
                        v.nome, v.tempoDeEstadia, v.custoPassagem);

        System.out.println("Lista nova com as viagens que melhor se encaixam nos requisitos: ");
        listaViagens.stream()
                .filter(tempoDeEstadia)
                .filter(custoPassagem)
                .map(listaNova)
                .forEach(println);
    }
}
