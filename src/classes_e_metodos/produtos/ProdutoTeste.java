package classes_e_metodos.produtos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 2200.00);

        Produto.desconto = 0.31415; //default: 0.25
        double porcentagem = Produto.desconto * 100;
        System.out.println("DESCONTO ATUAL DA LOJA '25% de Desconto': " + porcentagem + "%");

        var p2 = new Produto(); //lembrando que com var, o java infere o tipo de p2
        p2.nome = "Caneta Preta";
        p2.preco = 4.00;

        System.out.println("\n--------- Detalhes da Compra ---------");
        //sobrecarga de métodos
        double descontoGerente = 0.5;
        double descontoTotal = (descontoGerente + Produto.desconto) * 100;
        double preco_desconto1 = p1.precoComDesconto(descontoGerente);
        double preco_desconto2 = p2.precoComDesconto();
        System.out.printf("Produto: %s |  Preço Final: R$ %.2f | Desconto Total: %.2f%%\n", p1.nome, preco_desconto1, descontoTotal);
        System.out.printf("Produto: %s | Preço Final: R$ %.2f | Desconto Total: %.2f%%\n", p2.nome, preco_desconto2, Produto.desconto * 100);
        //curiosidade: para que % apareça no print sem dar erro, tem que usar %%

        System.out.println("\n--------- Média e Total do Carrinho ---------");
        double mediaCarrinho = (preco_desconto1 + preco_desconto2) / 2;
        double totalCarrinho = Produto.calcTotal(preco_desconto1, preco_desconto2); //uso do mét.odo pertencente à classe Produto
        System.out.printf("Média de preços do carrinho: R$ %.2f\n", mediaCarrinho); //nesse exemplo o desvio padrão tá alto...
        System.out.printf("Total: R$ %.2f", totalCarrinho);


    }
}
