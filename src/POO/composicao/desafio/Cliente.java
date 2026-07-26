package POO.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    final ArrayList<Compra> compras = new ArrayList<>();
    final String nome;

    Cliente(String nome){
        this.nome = nome;
    }

    void criarCompra(){
        Compra compra = new Compra();
        this.compras.add(compra);
        System.out.println("Compra adicionada à lista de compras do cliente.");
    }

    void detalharCliente(){
        int id_compra = 1;
        double total_cliente = 0;

        System.out.println("*** " + this.nome + " *** ");
        System.out.printf("%-5s | %-18s | %-10s | %-12s | %-12s%n", //obs: recomenda-se usar %n ao invés de /n para manter consistência
                "ID_COMPRA", "NOME_PRODUTO", "QUANTIDADE", "PREÇO (R$)", "TOTAL_ITEM (R$)");

        for (Compra compra: compras){
            for (Item item: compra.itens){
                double total_item = item.quantidade * item.produto.preco;
                total_cliente += total_item;

                System.out.printf("▷  %-4d | %-20s | %-10d | R$ %-10.2f | R$ %-10.2f%n",
                        id_compra, item.produto.nome, item.quantidade, item.produto.preco, total_item);
            }
            id_compra++;
        }

        System.out.println("→ Total gasto pelo cliente: R$" + total_cliente);
    }

}
