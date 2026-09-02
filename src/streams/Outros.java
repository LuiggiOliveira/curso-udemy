package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 9.5);
        Aluno a2 = new Aluno("Juliana", 6.8);
        Aluno a3 = new Aluno("Mariana", 7.5);
        Aluno a4 = new Aluno("Ana Maria", 7);
        Aluno a5 = new Aluno("Gui", 9.0);
        Aluno a6 = new Aluno("Ana Maria", 7);
        Aluno a7 = new Aluno("Juliana", 6.8);
        Aluno a8 = new Aluno("Mateus", 6.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct... (SELECT DISTINCT...)");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit...");
        // o skip pula a partir de uma posição n da lista e o limit limita o tamanho da nova stream
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile...");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7) //ele para quando encontrar alguém reprovado
                .forEach(System.out::println);
    }
}
