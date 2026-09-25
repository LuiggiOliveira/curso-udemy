package generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Pedro");
        resultadoConcurso.adicionar(2, "Maria");
        resultadoConcurso.adicionar(3, "Carlos");
        resultadoConcurso.adicionar(4, "Roberto");

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(3));
        System.out.println(resultadoConcurso.getValor(4));

    }
}
