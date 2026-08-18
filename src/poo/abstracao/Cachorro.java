package poo.abstracao;

public class Cachorro extends Mamifero {

//    @Override
//    public String mover() {
//        return "Usando as patas";
//    } -> apenas para caso esse método não seja "final" na classe Mamifero

    @Override
    public String mamar() {
        return "Usando leite";
    }
}
