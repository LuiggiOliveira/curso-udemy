package excecao.personalizadaA;

import streams.Aluno;

public class TesteValidar {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno(" A  ", 7);
            Validar.aluno(null); // por serem "não checados", eu poderia não tratar essas exceções já que herdam de RunTimeException
        } catch (StringVaziaException e) { // ou poderia fazer com o "pipe": StringVaziaException | NumeroForaDoIntervaloException
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");
    }
}
