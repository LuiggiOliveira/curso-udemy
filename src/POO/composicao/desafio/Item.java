package POO.composicao.desafio;

public class Item {

    final Produto produto;
    int quantidade;

    Item(Produto produto, int quantidade){
        this.quantidade = quantidade;
        this.produto = produto;
    }
}
