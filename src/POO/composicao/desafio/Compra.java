package POO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
        System.out.println("Item adicionado à lista de itens.");
    }

    double getTotalCompra(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
