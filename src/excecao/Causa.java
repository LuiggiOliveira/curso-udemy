package excecao;

public class Causa {

    public static void main(String[] args) {

        // Uma exceção pode causar outra exceção que gera uma outra exceção... Ou seja, a primeira exceção é a causadora
        // E nos logs de erro, é importante saber disso para poder encontrar de fato quem deu início a isso
        try {
            metodoA(null);
        } catch (IllegalArgumentException e) {
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }

//        metodoA(null);
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw   new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) throw new NullPointerException("O aluno está NULL");
        System.out.println(aluno.nome);
    }
}
