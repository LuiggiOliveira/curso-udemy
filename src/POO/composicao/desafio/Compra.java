package POO.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
        System.out.println("Item adicionado à lista de itens.");
    }


    double getValorTotal(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
