package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade){
        this.itens.add(new Item(produto, quantidade));
        System.out.println("Item adicionado à lista de itens.");
    }

    void adicionarItem(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco); // Produto produto = new Produto(nome, preco)
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
