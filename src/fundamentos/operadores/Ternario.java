package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        //É um operador de ATRIBUIÇÃO CONDICIONAL

        double media = 7.0;
        String resultaParcial = media >= 5.0 ?
                "em recuperação." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultaParcial;

        //apesar de possível, não é recomendável colocar operações ternárias uma dentro da outra por conta de legibilidade
        //String resultadoFinal = media >= 7.0 ? "aprovado." : media >= 5.0 ? "em recuperação." : "reprovado.";

        System.out.println(resultadoFinal);
    }
}
