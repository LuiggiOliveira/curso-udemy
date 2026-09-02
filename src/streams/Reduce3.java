package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.5);
        Aluno a2 = new Aluno("Juliana", 6.1);
        Aluno a3 = new Aluno("Mariana", 8.5);
        Aluno a4 = new Aluno("Ana Maria", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = a -> a.nota;
        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedia =
                (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(getNota)
                .reduce(new Media(), calcularMedia, combinarMedia); //aqui o combiner nunca é utilizado, já que é sequencial

        Media media2 = alunos.parallelStream()
                .filter(aprovado)
                .map(getNota)
                .reduce(new Media(), calcularMedia, combinarMedia);
        //aqui sim o combiner é utilizado, pois vão existir 2 threads em paralelo, cada uma com uma instância de Média chamando adicionar(nota)
        //mesclando os resultados parciais e retornando uma outra Média, que vai possuir a média resultante ao combinar
        // as médias de todos os aprovados

        System.out.println("Média dos aprovados é: " + media.getValor());
        System.out.println("Média dos aprovados é " + media2.getValor());
    }
}
