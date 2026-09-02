package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 9.5);
        Aluno a2 = new Aluno("Juliana", 8.1);
        Aluno a3 = new Aluno("Mariana", 7.5);
        Aluno a4 = new Aluno("Ana Maria", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        // são funções terminadoras também, além de forEach e reduce
        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));

        System.out.println();
        System.out.println(alunos.stream().allMatch(reprovado));
        System.out.println(alunos.stream().anyMatch(reprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
