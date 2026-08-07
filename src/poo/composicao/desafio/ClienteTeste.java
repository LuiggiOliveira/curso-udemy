package poo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Roberto Silva");
        Cliente cliente2 = new Cliente("Fabiana Rodrigues");

        Produto produto1 = new Produto("Ventilador", 129.56);
        Produto produto2 = new Produto("Notebook", 2200.00);
        Produto produto3 = new Produto("Celular", 1500.00);

        // COMPRAS DO PRIMEIRO CLIENTE
        cliente.criarCompra();
        cliente.compras.get(0).adicionarItem(produto2, 1);
        cliente.compras.get(0).adicionarItem(produto3, 2);

        cliente.criarCompra();
        cliente.compras.get(1).adicionarItem(produto1, 1);

        System.out.println();
        cliente.detalharCliente();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // COMPRAS DO SEGUNDO CLIENTE
        cliente2.criarCompra();
        cliente2.compras.get(0).adicionarItem("Café Solúvel", 5.2, 3); // instanciei outro produto aqui diretamente
        cliente2.compras.get(0).adicionarItem(produto3, 1);

        cliente2.criarCompra();
        cliente2.compras.get(1).adicionarItem(produto2, 1);
        cliente2.compras.get(1).adicionarItem(produto1, 1);

        System.out.println();
        cliente2.detalharCliente();

    }
}
