package classes_e_metodos.desafio_modulo;

public class Jantar {
    public static void main(String[] args) {
        //tá me dando mais fome...
        Comida c1 = new Comida("Lasanha", 150);
        Comida c2 = new Comida("Pizza de Frango com Catupiry", 60); //no caso 60g por fatia
        Comida c3 = new Comida("Saladinha leve e saudável (alface e tomate)", 104);

        Pessoa p1 = new Pessoa("Gabriel", 80);
        Pessoa p2 = new Pessoa("Gabriela", 60);

        System.out.println("--- Pesos Iniciais ---");
        p1.imprimirDetalhes();
        p2.imprimirDetalhes();

        System.out.println("--- Para abrir o apetite ---");
        p1.comer(c1, 1);
        p2.comer(c3, 2);
        p1.imprimirDetalhes();
        p2.imprimirDetalhes();

        System.out.println("--- Comendo pra valer ---");
        p1.comer(c2, 8);
        p2.comer(c1, 4);
        p1.imprimirDetalhes();
        p2.imprimirDetalhes();

        System.out.println(" --- Por fim, nesse 'pequeno' jantar *leve e saudável*, para não prejudicar o sono... ---");
        p1.comer(c3, 5);
        p2.comer(c2, 2);
        p1.imprimirDetalhes();
        p2.imprimirDetalhes();
    }
}
