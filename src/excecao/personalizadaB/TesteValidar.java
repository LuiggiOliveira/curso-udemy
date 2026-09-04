package excecao.personalizadaB;

import streams.Aluno;

public class TesteValidar {

    public static void main(String[] args) {

        // Já aqui, eu precisei tratar porque agora são exceções que herdam de Exception, ou seja, são exceções checadas
        try {
            Aluno aluno = new Aluno(" A  ", 7);
            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");
    }
}
