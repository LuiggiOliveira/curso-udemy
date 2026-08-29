package lambdas;

/*
 * 1. A partir do produto calcular o preço real (com desconto) OK
 * 2. Imposto municipal: >= 2500 (8,5%) / < 2500 (isento) OK
 * 3. Frete: >= 3000 (100) / < 3000 (50) OK
 * 4. Arredondar: Deixar duas casas decimais (obs: não irei usar simplesmente Sytem.out.printf(%.2f)) OK
 * 5. Formatar: R$ 1234,00
 */

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Function <Produto, Double> calcularDescontoInicial = (produto) ->
                produto.preco * (1 - produto.desconto);

        UnaryOperator <Double> calcularImpostoMunicipal = valorProduto ->
                valorProduto >= 2500 ? valorProduto * 1.085 : valorProduto;

        UnaryOperator <Double> calcularFrete = valorProduto ->
                valorProduto >= 3000 ? valorProduto + 100 : valorProduto + 50;

        UnaryOperator <Double> arredondarValor = valorProduto ->
                Math.round(valorProduto * 100) / 100.0;
        //obs: Math.round() retorna long, portanto, eu tive que de algum jeito fazer um casting para double, se não perderia o ponto flutuante

        Function <Double, String> formatarValor = valorProduto -> ("R$ " + valorProduto).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);
        double resultado = calcularDescontoInicial
                .andThen(calcularImpostoMunicipal)
                .andThen(calcularFrete)
                .andThen(arredondarValor)
                .apply(p);

        String resultadoFormatado = formatarValor.apply(resultado);

        System.out.println("Valor real após sequencialmente aplicar os descontos (aqui não somei os descontos e depois apliquei):");
        System.out.println(resultadoFormatado);
    }
}
