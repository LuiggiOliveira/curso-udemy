package POO.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

//    Observação: eu mudei para a interface List ao invés de ArrayList para seguir as boas práticas de programação, permitindo
//    trocar a implementação interna sem quebrar o código, mantendo o baixo acoplamento
    final List<Compra> compras = new ArrayList<>();
    final String nome;

    Cliente(String nome){
        this.nome = nome;
    }

    void criarCompra(){
        Compra compra = new Compra();
        this.compras.add(compra);
        System.out.println("Compra adicionada à lista de compras do cliente.");
    }

    double getTotalCliente(){
        double total = 0;

        for (Compra compra: compras){
            total += compra.getTotalCompra();
        }

        return total;
    }

    void detalharCliente(){
        int id_compra = 1;

        System.out.println("*** " + this.nome + " *** ");
        System.out.printf("%-6s | %-15s | %-10s | %-13s | %-12s%n", //obs: recomenda-se usar %n ao invés de /n para manter consistência
                "ID_COMPRA", "NOME_PRODUTO", "QUANTIDADE", "PREÇO (R$)", "TOTAL_ITEM (R$)");

        for (Compra compra: compras){
            for (Item item: compra.itens){
                double total_item = item.quantidade * item.produto.preco;
                System.out.printf("▷  %-6d | %-15s | %-10d | R$ %-10.2f | R$ %-8.2f%n",
                        id_compra, item.produto.nome, item.quantidade, item.produto.preco, total_item);
            }
            id_compra++;
        }

        System.out.println("→ Total gasto pelo cliente: R$" + this.getTotalCliente());
    }

}
