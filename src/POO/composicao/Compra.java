package POO.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>(); // relação 1:N

    // obs: ao mudar de uma relação unidirecional para uma bidirecional, tive que ter mais cuidado com a consistência dessa relação entre
    // compra e item e não só apenas usar "compra1.itens.add(new Item(...));"

    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item){ // cria uma relação bidirecional
        this.itens.add(item); // aqui não precisaria do "this", mas eu coloquei mesmo assim só para lembrar que é possível
        item.compra = this;
    }

    double getPrecoTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
