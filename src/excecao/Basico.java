package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            Basico.imprimirNomeDoAluno(a1); //EXCEÇÃO -> java.lang.NullPointerException: Cannot read field "nome" because "a" is null
        } catch (Exception e){
            System.out.println("Houve um erro ao imprimir o nome do aluno.");
        }

        try { // lembre-se que é possível fazer o surround para agilizar esse processo
            System.out.println(7 / 0); // EXCEÇÃO -> java.lang.ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
            e.printStackTrace(); // mostra a pilha de métodos e, inclusive, é assíncrono (fora de ordem de execução)
        }

        System.out.println("Fim do código. Todas as exceções foram tratadas!");
    }

    public static void imprimirNomeDoAluno (Aluno a){
        System.out.println(a.nome);
    }
}
    