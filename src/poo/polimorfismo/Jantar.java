package poo.polimorfismo;

//  todo: desafio de transformar o polimorfismo estático (sobrecarga) em polimorfismo dinâmico
public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(98.8);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Carne ingrediente3 = new Carne(0.5);
        Sorvete sobremesa = new Sorvete(0.4);
//      Comida comida = new Comida(0.1); É UMA CLASSE ABSTRATA, LOGO, NÃO PODE SER INSTANCIADA
        Comida ingrediente4 = new Arroz(0.22); //porém, eu posso instanciar uma classe filha a partir de um tipo Comida

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);

        System.out.println(convidado.getPeso());
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
