package POO.composicao;

import java.util.ArrayList;

public class Curso {

    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();
    // é "final" pois o endereço em que essa lista aponta será sempre constante para que não ocorra, por exemplo, dentro do construtor
    // this.cursos = new ArrayList<>();
    // mas eu ainda posso adicionar ou remover elementos nela

    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this); // relação bidirecional N:N
    }

    Aluno getAlunoPorNome(String nome){
        for (Aluno aluno: alunos){
            if(aluno.nome.equalsIgnoreCase(nome)){
                return aluno;
            }
        }
        return null;
    }

    public String toString(){
        return nome;
    }
}
