package poo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.printf("%s: Estou matriculado no %s!\n", aluno.nome, curso1.nome);
        }

        for(Aluno aluno: curso2.alunos){
            System.out.printf("%s: Estou matriculado no %s!\n", aluno.nome, curso2.nome);
        }

        for(Aluno aluno: curso3.alunos){
            System.out.printf("%s: Estou matriculado no %s!\n", aluno.nome, curso3.nome);
        }

        System.out.println(aluno1.cursos.get(0).alunos); // usando o toString() para converter objeto em String

        Curso cursoEncontrado = aluno1.getCursoPorNome("Java Completo");
        Aluno alunoEncontrado = curso1.getAlunoPorNome("Maria");

        if(cursoEncontrado != null){
            System.out.println("Curso encontrado: " + cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

        if(alunoEncontrado != null){
            System.out.println("Aluno encontrado: " + alunoEncontrado.nome);
            System.out.println(alunoEncontrado.cursos);
        }
    }
}
