package classes_e_metodos.produtos;
//import estruturas_controle.Switch (é necessário importar, pois essa classe pertence a outro pacote)
public class Produto {
    //membros da classe e variáveis do objeto (já que não possuem static, não são variáveis da classe)
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial, double precoInicial){
        this.nome = nomeInicial;
        this.preco = precoInicial;
    }

    Produto() {
        //construtor padrão (o mesmo que o java cria automaticamente de forma implícita quando não declaramos nenhum construtor
        //de forma explícita
    }

    double precoComDesconto(double descontoGerente){
        return this.preco * (1 - (desconto + descontoGerente));
    }

    double precoComDesconto(){
        return this.preco * (1 - (desconto));
    }

    static double calcTotal(double valor1, double valor2){
        return valor1 + valor2;
    }
}
