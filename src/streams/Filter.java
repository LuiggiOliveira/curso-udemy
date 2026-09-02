package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Lia", 7.4);
        Aluno a4 = new Aluno("Pedro", 9.6);
        Aluno a5 = new Aluno("Rebeca", 6.7);
        Aluno a6 = new Aluno("Gui", 8.2);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabéns " + a.nome + "! você foi aprovado(a)")
                .forEach(System.out::println);


    }
}
